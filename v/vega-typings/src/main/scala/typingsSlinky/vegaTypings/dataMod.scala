package typingsSlinky.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaTypings.anon.Feature
import typingsSlinky.vegaTypings.anon.Filter
import typingsSlinky.vegaTypings.anon.Property
import typingsSlinky.vegaTypings.onTriggerMod.OnTrigger
import typingsSlinky.vegaTypings.runtimeMod.TypeInference
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.transformMod.Transforms
import typingsSlinky.vegaTypings.vegaTypingsStrings.auto
import typingsSlinky.vegaTypings.vegaTypingsStrings.csv
import typingsSlinky.vegaTypings.vegaTypingsStrings.dsv
import typingsSlinky.vegaTypings.vegaTypingsStrings.json
import typingsSlinky.vegaTypings.vegaTypingsStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @js.native
  trait BaseData extends Data {
    
    var name: String = js.native
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.native
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.native
  }
  object BaseData {
    
    @scala.inline
    def apply(name: String): BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseData]
    }
    
    @scala.inline
    implicit class BaseDataMutableBuilder[Self <: BaseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.dataMod.SourceData
    - typingsSlinky.vegaTypings.dataMod.ValuesData
    - typingsSlinky.vegaTypings.dataMod.UrlData
    - typingsSlinky.vegaTypings.dataMod.BaseData
  */
  trait Data extends StObject
  object Data {
    
    @scala.inline
    def BaseData(name: String): typingsSlinky.vegaTypings.dataMod.BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.BaseData]
    }
    
    @scala.inline
    def SourceData(name: String, source: String | js.Array[String]): typingsSlinky.vegaTypings.dataMod.SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.SourceData]
    }
    
    @scala.inline
    def UrlData(name: String, url: URI | SignalRef): typingsSlinky.vegaTypings.dataMod.UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.UrlData]
    }
    
    @scala.inline
    def ValuesData(name: String, values: js.Array[Datum] | js.Object): typingsSlinky.vegaTypings.dataMod.ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.ValuesData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.boolean
    - typingsSlinky.vegaTypings.vegaTypingsStrings.number
    - typingsSlinky.vegaTypings.vegaTypingsStrings.date
    - typingsSlinky.vegaTypings.vegaTypingsStrings.string
  */
  trait DataType extends TypeInference
  object DataType {
    
    @scala.inline
    def boolean: typingsSlinky.vegaTypings.vegaTypingsStrings.boolean = "boolean".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.boolean]
    
    @scala.inline
    def date: typingsSlinky.vegaTypings.vegaTypingsStrings.date = "date".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.date]
    
    @scala.inline
    def number: typingsSlinky.vegaTypings.vegaTypingsStrings.number = "number".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.number]
    
    @scala.inline
    def string: typingsSlinky.vegaTypings.vegaTypingsStrings.string = "string".asInstanceOf[typingsSlinky.vegaTypings.vegaTypingsStrings.string]
  }
  
  type Datum = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.dataMod.FormatJSON
    - typingsSlinky.vegaTypings.dataMod.FormatSV
    - typingsSlinky.vegaTypings.dataMod.FormatDSV
    - typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
    - typingsSlinky.vegaTypings.anon.Parse
  */
  type Format = _Format | FormatTopoJSON
  
  @js.native
  trait FormatDSV extends _Format {
    
    var delimiter: String = js.native
    
    var header: js.UndefOr[js.Array[String]] = js.native
    
    var parse: js.UndefOr[Parse] = js.native
    
    var `type`: dsv = js.native
  }
  object FormatDSV {
    
    @scala.inline
    def apply(delimiter: String, `type`: dsv): FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatDSV]
    }
    
    @scala.inline
    implicit class FormatDSVMutableBuilder[Self <: FormatDSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setType(value: dsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormatJSON extends _Format {
    
    var copy: js.UndefOr[Boolean] = js.native
    
    var parse: js.UndefOr[Parse] = js.native
    
    var property: js.UndefOr[String | SignalRef] = js.native
    
    var `type`: json = js.native
  }
  object FormatJSON {
    
    @scala.inline
    def apply(`type`: json): FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatJSON]
    }
    
    @scala.inline
    implicit class FormatJSONMutableBuilder[Self <: FormatJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setProperty(value: String | SignalRef): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormatSV extends _Format {
    
    var header: js.UndefOr[js.Array[String]] = js.native
    
    var parse: js.UndefOr[Parse] = js.native
    
    var `type`: csv | tsv = js.native
  }
  object FormatSV {
    
    @scala.inline
    def apply(`type`: csv | tsv): FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatSV]
    }
    
    @scala.inline
    implicit class FormatSVMutableBuilder[Self <: FormatSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setType(value: csv | tsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatTopoJSON = Property with (Feature | Filter)
  
  type Parse = auto | (StringDictionary[DataType | String])
  
  /* Inlined {  source :string | std.Array<string>} & vega-typings.vega-typings/types/spec/data.BaseData */
  @js.native
  trait SourceData extends Data {
    
    var name: String = js.native
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.native
    
    var source: String | js.Array[String] = js.native
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.native
  }
  object SourceData {
    
    @scala.inline
    def apply(name: String, source: String | js.Array[String]): SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceData]
    }
    
    @scala.inline
    implicit class SourceDataMutableBuilder[Self <: SourceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
  
  type URI = String
  
  /* Inlined {  url :vega-typings.vega-typings/types/spec/data.URI | vega-typings.vega-typings/types/spec.SignalRef,   format :vega-typings.vega-typings/types/spec/data.Format | vega-typings.vega-typings/types/spec.SignalRef | undefined,   async :boolean | vega-typings.vega-typings/types/spec.SignalRef | undefined} & vega-typings.vega-typings/types/spec/data.BaseData */
  @js.native
  trait UrlData extends Data {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.native
    
    var format: js.UndefOr[Format | SignalRef] = js.native
    
    var name: String = js.native
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.native
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.native
    
    var url: URI | SignalRef = js.native
  }
  object UrlData {
    
    @scala.inline
    def apply(name: String, url: URI | SignalRef): UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlData]
    }
    
    @scala.inline
    implicit class UrlDataMutableBuilder[Self <: UrlData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: URI | SignalRef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  values :std.Array<vega-typings.vega-typings/types/spec/data.Datum> | object,   format :vega-typings.vega-typings/types/spec/data.Format | vega-typings.vega-typings/types/spec.SignalRef | undefined,   async :boolean | vega-typings.vega-typings/types/spec.SignalRef | undefined} & vega-typings.vega-typings/types/spec/data.BaseData */
  @js.native
  trait ValuesData extends Data {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.native
    
    var format: js.UndefOr[Format | SignalRef] = js.native
    
    var name: String = js.native
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.native
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.native
    
    var values: js.Array[Datum] | js.Object = js.native
  }
  object ValuesData {
    
    @scala.inline
    def apply(name: String, values: js.Array[Datum] | js.Object): ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValuesData]
    }
    
    @scala.inline
    implicit class ValuesDataMutableBuilder[Self <: ValuesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: js.Array[Datum] | js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait _Format extends StObject
  object _Format {
    
    @scala.inline
    def FormatDSV(delimiter: String, `type`: dsv): typingsSlinky.vegaTypings.dataMod.FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.FormatDSV]
    }
    
    @scala.inline
    def FormatJSON(`type`: json): typingsSlinky.vegaTypings.dataMod.FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.FormatJSON]
    }
    
    @scala.inline
    def FormatSV(`type`: csv | tsv): typingsSlinky.vegaTypings.dataMod.FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.dataMod.FormatSV]
    }
    
    @scala.inline
    def Parse(parse: typingsSlinky.vegaTypings.dataMod.Parse): typingsSlinky.vegaTypings.anon.Parse = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaTypings.anon.Parse]
    }
  }
}
