package com.xt.feedback.common.plugin;

import org.apache.ibatis.cache.CacheKey;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInterceptor;
import com.github.pagehelper.dialect.helper.MySqlDialect;


public class CustomDialect extends MySqlDialect{
	private static final String SQL_SIGN="{AS limitable}";
	@Override
    public String getPageSql(String sql, Page page, CacheKey pageKey) {
        StringBuilder sqlBuilder = new StringBuilder(sql.length() + 14);
        sqlBuilder.append(sql);
        int index=sqlBuilder.indexOf(SQL_SIGN);
        //自定义位置分页
        if (index != -1) {
        StringBuilder limitBuilder=new StringBuilder(" LIMIT ");
        if (page.getStartRow() == 0) {
        	limitBuilder.append(page.getPageSize());
        } else {
        	limitBuilder.append(page.getStartRow());
        	limitBuilder.append(",");
        	limitBuilder.append(page.getPageSize());
            pageKey.update(page.getStartRow());
            
        }
        sqlBuilder.replace(index, index+SQL_SIGN.length()-1, limitBuilder.toString());
		pageKey.update(page.getPageSize());
        return sqlBuilder.toString();
        }
        
        //正常分页
        if (page.getStartRow() == 0) {
            sqlBuilder.append(" LIMIT ");
            sqlBuilder.append(page.getPageSize());
            
        } else {
            sqlBuilder.append(" LIMIT ");
            sqlBuilder.append(page.getStartRow());
            sqlBuilder.append(",");
            sqlBuilder.append(page.getPageSize());
            pageKey.update(page.getStartRow());
            
        }
        pageKey.update(page.getPageSize());
        return sqlBuilder.toString();
    }
}
