package typingsSlinky.vsoNodeApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  object ContractSerializer {
    
    /**
      * Process a pure JSON object (e.g. that came from a REST call) and transform it into a JS object
      * where date strings are converted to Date objects and enum values are converted from strings into
      * their numerical value.
      *
      * @param data The object to deserialize
      * @param contractMetadata The type info/metadata for the contract type being deserialize
      * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
      * @param unwrapWrappedCollections If true check for wrapped arrays (REST apis will not return arrays directly as the root result but will instead wrap them in a { values: [], count: 0 } object.
      */
    @JSImport("vso-node-api/Serialization", "ContractSerializer.deserialize")
    @js.native
    def deserialize(
      data: js.Any,
      contractMetadata: ContractMetadata,
      preserveOriginal: Boolean,
      unwrapWrappedCollections: Boolean
    ): js.Any = js.native
    
    /**
      * Process a contract in its raw form (e.g. date fields are Dates, and Enums are numbers) and
      * return a pure JSON object that can be posted to REST endpoint.
      *
      * @param data The object to serialize
      * @param contractMetadata The type info/metadata for the contract type being serialized
      * @param preserveOriginal If true, don't modify the original object. False modifies the original object (the return value points to the data argument).
      */
    @JSImport("vso-node-api/Serialization", "ContractSerializer.serialize")
    @js.native
    def serialize(data: js.Any, contractMetadata: ContractMetadata, preserveOriginal: Boolean): js.Any = js.native
  }
  
  @js.native
  trait ContractEnumMetadata extends StObject {
    
    var enumValues: js.UndefOr[StringDictionary[Double]] = js.native
  }
  object ContractEnumMetadata {
    
    @scala.inline
    def apply(): ContractEnumMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractEnumMetadata]
    }
    
    @scala.inline
    implicit class ContractEnumMetadataMutableBuilder[Self <: ContractEnumMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnumValues(value: StringDictionary[Double]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    }
  }
  
  @js.native
  trait ContractFieldMetadata extends StObject {
    
    var dictionaryKeyEnumType: js.UndefOr[ContractEnumMetadata] = js.native
    
    var dictionaryKeyIsDate: js.UndefOr[Boolean] = js.native
    
    var dictionaryValueEnumType: js.UndefOr[ContractEnumMetadata] = js.native
    
    var dictionaryValueFieldInfo: js.UndefOr[ContractFieldMetadata] = js.native
    
    var dictionaryValueIsDate: js.UndefOr[Boolean] = js.native
    
    var dictionaryValueTypeInfo: js.UndefOr[ContractMetadata] = js.native
    
    var enumType: js.UndefOr[ContractEnumMetadata] = js.native
    
    var isArray: js.UndefOr[Boolean] = js.native
    
    var isDate: js.UndefOr[Boolean] = js.native
    
    var isDictionary: js.UndefOr[Boolean] = js.native
    
    var typeInfo: js.UndefOr[ContractMetadata] = js.native
  }
  object ContractFieldMetadata {
    
    @scala.inline
    def apply(): ContractFieldMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractFieldMetadata]
    }
    
    @scala.inline
    implicit class ContractFieldMetadataMutableBuilder[Self <: ContractFieldMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDictionaryKeyEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "dictionaryKeyEnumType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryKeyEnumTypeUndefined: Self = StObject.set(x, "dictionaryKeyEnumType", js.undefined)
      
      @scala.inline
      def setDictionaryKeyIsDate(value: Boolean): Self = StObject.set(x, "dictionaryKeyIsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryKeyIsDateUndefined: Self = StObject.set(x, "dictionaryKeyIsDate", js.undefined)
      
      @scala.inline
      def setDictionaryValueEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "dictionaryValueEnumType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryValueEnumTypeUndefined: Self = StObject.set(x, "dictionaryValueEnumType", js.undefined)
      
      @scala.inline
      def setDictionaryValueFieldInfo(value: ContractFieldMetadata): Self = StObject.set(x, "dictionaryValueFieldInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryValueFieldInfoUndefined: Self = StObject.set(x, "dictionaryValueFieldInfo", js.undefined)
      
      @scala.inline
      def setDictionaryValueIsDate(value: Boolean): Self = StObject.set(x, "dictionaryValueIsDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryValueIsDateUndefined: Self = StObject.set(x, "dictionaryValueIsDate", js.undefined)
      
      @scala.inline
      def setDictionaryValueTypeInfo(value: ContractMetadata): Self = StObject.set(x, "dictionaryValueTypeInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryValueTypeInfoUndefined: Self = StObject.set(x, "dictionaryValueTypeInfo", js.undefined)
      
      @scala.inline
      def setEnumType(value: ContractEnumMetadata): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
      
      @scala.inline
      def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
      
      @scala.inline
      def setIsDate(value: Boolean): Self = StObject.set(x, "isDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDateUndefined: Self = StObject.set(x, "isDate", js.undefined)
      
      @scala.inline
      def setIsDictionary(value: Boolean): Self = StObject.set(x, "isDictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDictionaryUndefined: Self = StObject.set(x, "isDictionary", js.undefined)
      
      @scala.inline
      def setTypeInfo(value: ContractMetadata): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeInfoUndefined: Self = StObject.set(x, "typeInfo", js.undefined)
    }
  }
  
  @js.native
  trait ContractMetadata extends StObject {
    
    var fields: js.UndefOr[StringDictionary[ContractFieldMetadata]] = js.native
  }
  object ContractMetadata {
    
    @scala.inline
    def apply(): ContractMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContractMetadata]
    }
    
    @scala.inline
    implicit class ContractMetadataMutableBuilder[Self <: ContractMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: StringDictionary[ContractFieldMetadata]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    }
  }
  
  @js.native
  trait IWebApiArrayResult extends StObject {
    
    var count: Double = js.native
    
    var value: js.Array[_] = js.native
  }
  object IWebApiArrayResult {
    
    @scala.inline
    def apply(count: Double, value: js.Array[_]): IWebApiArrayResult = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebApiArrayResult]
    }
    
    @scala.inline
    implicit class IWebApiArrayResultMutableBuilder[Self <: IWebApiArrayResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SerializationData extends StObject {
    
    var requestTypeMetadata: js.UndefOr[ContractMetadata] = js.native
    
    var responseIsCollection: Boolean = js.native
    
    var responseTypeMetadata: js.UndefOr[ContractMetadata] = js.native
  }
  object SerializationData {
    
    @scala.inline
    def apply(responseIsCollection: Boolean): SerializationData = {
      val __obj = js.Dynamic.literal(responseIsCollection = responseIsCollection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializationData]
    }
    
    @scala.inline
    implicit class SerializationDataMutableBuilder[Self <: SerializationData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestTypeMetadata(value: ContractMetadata): Self = StObject.set(x, "requestTypeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTypeMetadataUndefined: Self = StObject.set(x, "requestTypeMetadata", js.undefined)
      
      @scala.inline
      def setResponseIsCollection(value: Boolean): Self = StObject.set(x, "responseIsCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeMetadata(value: ContractMetadata): Self = StObject.set(x, "responseTypeMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeMetadataUndefined: Self = StObject.set(x, "responseTypeMetadata", js.undefined)
    }
  }
}
