package com.xt.feedback.common.util;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.CollectionType;

public class JacksonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 防止反射调用构造器创建对象
     */
    private JacksonUtil() {
        throw new AssertionError();
    }

    /**
     * 自定义日期序列化处理类
     * LocalDateTime
     * jdk8 support
     */
    public static class JsonLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {


        @Override
        public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String localdateTimeStr = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
            jsonGenerator.writeString(localdateTimeStr);
        }
    }

    /**
     * 自定义日期序列化处理类
     * LocalDateTime
     * jdk8 support
     */
    public static class JsonLocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {


        @Override
        public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            String str = jsonParser.getText().trim();
            return LocalDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME);
        }
    }

    /**
     * 自定义日期反序列化处理类
     * LocalDate
     * jdk8 support
     */
    public static class JsonLocalDateDeserializer extends JsonDeserializer<LocalDate> {

        @Override
        public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String str = jsonParser.getText().trim();
            return LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
        }
    }

    /**
     * 自定义日期序列化类
     * LocalDate
     * jdk8 support
     */
    public static class JsonLocalDateSerializer extends JsonSerializer<LocalDate> {


        @Override
        public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String localdateStr = localDate.format(DateTimeFormatter.ISO_DATE);
            jsonGenerator.writeString(localdateStr);
        }
    }

    /**
     * json数据转pojo
     *
     * @param jsonStr json字符串
     * @param cls     映射类型
     * @param <T>     推导类型
     * @return 推导类型json对象
     */
    public static <T> T json2Pojo(String jsonStr, Class<T> cls) {
        T object = null;
        try {
            object = objectMapper.readValue(jsonStr, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return object;
    }


    /**
     * json数据转PojoList
     *
     * @param jsonStr json数据
     * @param cls     类型
     * @param <T>     推导类型
     * @return pojoList
     */
    public static <T> List<T> jsonArray2PojoList(String jsonStr, Class<T> cls) {
        List<T> pojoList = null;
        try {
            CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, cls);
            pojoList = objectMapper.readValue(jsonStr, listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pojoList;
    }


    /**
     * pojo转json
     *
     * @param obj pojo
     * @return json字符串
     */
    public static String pojo2Json(Object obj) {
        String jsonStr = "";
        try {
            jsonStr = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    /**
     * json转listMap
     *
     * @param jsonArray jsonArray字符串
     * @return Listmap对象
     */
    public static List<Map<String, Object>> jsonArray2ListMap(String jsonArray) {
        List<Map<String, Object>> convertedListMap = null;
        try {
            convertedListMap = objectMapper.readValue(jsonArray, new TypeReference<List<Map<String, Object>>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertedListMap;
    }

    /**
     * json转map
     *
     * @param json json字符串
     * @return map对象
     */
    public static Map<String, Object> json2Map(String json) {
        Map<String, Object> convertedMap = null;
        try {
            convertedMap = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return convertedMap;
    }


    /**
     * listMap转json
     *
     * @param listMap listMap
     * @return
     */
    public static String listMap2JsonArray(List<Map<String, Object>> listMap) {
        String jsonStr = "";
        try {
            jsonStr = objectMapper.writeValueAsString(listMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return jsonStr;
    }



}
