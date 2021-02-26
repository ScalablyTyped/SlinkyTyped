package typingsSlinky.toJsonSchema

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema4
import typingsSlinky.jsonSchema.mod.JSONSchema4Type
import typingsSlinky.jsonSchema.mod.JSONSchema4TypeName
import typingsSlinky.jsonSchema.mod.JSONSchema4Version
import typingsSlinky.toJsonSchema.anon.AdditionalProperties
import typingsSlinky.toJsonSchema.anon.DetectFormat
import typingsSlinky.toJsonSchema.anon.Mode
import typingsSlinky.toJsonSchema.toJsonSchemaBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * `to-json-schema` exports function that converts most javascript values to
    * JSON schema. Such a schema can be used to further validation of similar
    * objects/values
    *
    * @param value Any javascript value
    * @param options optional options object
    */
  @JSImport("to-json-schema", JSImport.Namespace)
  @js.native
  def apply(value: js.Any): JSONSchema3or4 = js.native
  @JSImport("to-json-schema", JSImport.Namespace)
  @js.native
  def apply(value: js.Any, options: Options): JSONSchema3or4 = js.native
  
  @js.native
  trait JSONSchema3or4
    extends /* k */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[JSONSchema4Type] = js.native
    
    @JSName("$ref")
    var $ref: js.UndefOr[String] = js.native
    
    @JSName("$schema")
    var $schema: js.UndefOr[JSONSchema4Version] = js.native
    
    var additionalItems: js.UndefOr[Boolean | JSONSchema3or4] = js.native
    
    var additionalProperties: js.UndefOr[Boolean | JSONSchema3or4] = js.native
    
    var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
    
    var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
    
    var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.native
    
    var dependencies: js.UndefOr[StringDictionary[JSONSchema3or4 | String | js.Array[String]]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    /** JSON Schema 3 only */
    var disallow: js.UndefOr[String | (js.Array[String | JSONSchema3or4])] = js.native
    
    /** JSON Schema 3 uses `divisibleBy` instead of `multipleOf`. */
    var divisibleBy: js.UndefOr[Double] = js.native
    
    var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.native
    
    var exclusiveMaximum: js.UndefOr[Boolean] = js.native
    
    var exclusiveMinimum: js.UndefOr[Boolean] = js.native
    
    var `extends`: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var items: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.native
    
    var maxItems: js.UndefOr[Double] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var maxProperties: js.UndefOr[Double] = js.native
    
    var maximum: js.UndefOr[Double] = js.native
    
    var minItems: js.UndefOr[Double] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var minProperties: js.UndefOr[Double] = js.native
    
    var minimum: js.UndefOr[Double] = js.native
    
    var multipleOf: js.UndefOr[Double] = js.native
    
    var not: js.UndefOr[JSONSchema4] = js.native
    
    var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var patternProperties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.native
    
    var properties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.native
    
    var required: js.UndefOr[Boolean | `false` | js.Array[String]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.native
    
    var uniqueItems: js.UndefOr[Boolean] = js.native
  }
  object JSONSchema3or4 {
    
    @scala.inline
    def apply(): JSONSchema3or4 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONSchema3or4]
    }
    
    @scala.inline
    implicit class JSONSchema3or4MutableBuilder[Self <: JSONSchema3or4] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
      
      @scala.inline
      def set$schema(value: JSONSchema4Version): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalItems(value: Boolean | JSONSchema3or4): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalItemsUndefined: Self = StObject.set(x, "additionalItems", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: Boolean | JSONSchema3or4): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setAllOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
      
      @scala.inline
      def setAllOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "allOf", js.Array(value :_*))
      
      @scala.inline
      def setAnyOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
      
      @scala.inline
      def setAnyOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: JSONSchema4Type): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultNull: Self = StObject.set(x, "default", null)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: StringDictionary[JSONSchema4]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDependencies(value: StringDictionary[JSONSchema3or4 | String | js.Array[String]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisallow(value: String | (js.Array[String | JSONSchema3or4])): Self = StObject.set(x, "disallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowUndefined: Self = StObject.set(x, "disallow", js.undefined)
      
      @scala.inline
      def setDisallowVarargs(value: (String | JSONSchema3or4)*): Self = StObject.set(x, "disallow", js.Array(value :_*))
      
      @scala.inline
      def setDivisibleBy(value: Double): Self = StObject.set(x, "divisibleBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivisibleByUndefined: Self = StObject.set(x, "divisibleBy", js.undefined)
      
      @scala.inline
      def setEnum(value: js.Array[JSONSchema4Type]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: JSONSchema4Type*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      @scala.inline
      def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      @scala.inline
      def setExtends(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      @scala.inline
      def setExtendsVarargs(value: JSONSchema3or4*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItems(value: JSONSchema3or4 | js.Array[JSONSchema3or4]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: JSONSchema3or4*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      @scala.inline
      def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
      
      @scala.inline
      def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      @scala.inline
      def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
      
      @scala.inline
      def setNot(value: JSONSchema4): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOneOf(value: js.Array[JSONSchema4]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
      
      @scala.inline
      def setOneOfVarargs(value: JSONSchema4*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternProperties(value: StringDictionary[JSONSchema3or4]): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setProperties(value: StringDictionary[JSONSchema3or4]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean | `false` | js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: JSONSchema4TypeName | js.Array[JSONSchema4TypeName]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: JSONSchema4TypeName*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var arrays: js.UndefOr[Mode] = js.native
    
    var objects: js.UndefOr[AdditionalProperties] = js.native
    
    /**
      * By providing `postProcessFnc`, you can modify or replace generated
      * schema. This function will be called recursively for all the properties
      * and sub-properties and array items from leaves to the root. If you want
      * to preserve default functionality, don't forget to call defaultFunc
      * which is currently responsible for setting `required` for the schema
      * items if there is common option `required` set to true.
      *
      * @param type JSON schema type of the `value`
      * @param schema Generated JSON schema
      * @param value - input value
      * @param defaultFunc standard function that is used to post-process
      *                    generated schema. Takes the `type`, `schema`,
      *                    `value` params.
      */
    var postProcessFnc: js.UndefOr[
        js.Function4[
          /* type */ JSONSchema4TypeName, 
          /* schema */ JSONSchema3or4, 
          /* value */ js.Any, 
          /* defaultFunc */ js.Function3[
            /* type */ JSONSchema4TypeName, 
            /* schema */ JSONSchema3or4, 
            /* value */ js.Any, 
            JSONSchema3or4
          ], 
          JSONSchema3or4
        ]
      ] = js.native
    
    /**
      * specify `true` to make all properties required.
      *
      * @default false
      * @example
      * const schema = toJsonSchema(33, {required: false});
      * // { type: "integer" }
      * const schema = toJsonSchema(33, {required: true});
      * // { type: "integer", "required": true }
      */
    var required: js.UndefOr[Boolean] = js.native
    
    var strings: js.UndefOr[DetectFormat] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrays(value: Mode): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      @scala.inline
      def setObjects(value: AdditionalProperties): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setPostProcessFnc(
        value: (/* type */ JSONSchema4TypeName, /* schema */ JSONSchema3or4, /* value */ js.Any, /* defaultFunc */ js.Function3[
              /* type */ JSONSchema4TypeName, 
              /* schema */ JSONSchema3or4, 
              /* value */ js.Any, 
              JSONSchema3or4
            ]) => JSONSchema3or4
      ): Self = StObject.set(x, "postProcessFnc", js.Any.fromFunction4(value))
      
      @scala.inline
      def setPostProcessFncUndefined: Self = StObject.set(x, "postProcessFnc", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStrings(value: DetectFormat): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    }
  }
}
