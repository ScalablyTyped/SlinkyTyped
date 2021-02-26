package typingsSlinky.theo

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.immutable.Immutable.OrderedMap
import typingsSlinky.theo.theoStrings.aliases
import typingsSlinky.theo.theoStrings.global
import typingsSlinky.theo.theoStrings.imports
import typingsSlinky.theo.theoStrings.meta
import typingsSlinky.theo.theoStrings.options
import typingsSlinky.theo.theoStrings.props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theo", "convert")
  @js.native
  def convert(options: ConvertOptions): js.Promise[String] = js.native
  
  @JSImport("theo", "convertSync")
  @js.native
  def convertSync(options: ConvertOptions): String = js.native
  
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: T, format: String): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: T, format: FormatResultFn): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: Format, format: String): Unit = js.native
  @JSImport("theo", "registerFormat")
  @js.native
  def registerFormat[T /* <: String */](name: Format, format: FormatResultFn): Unit = js.native
  
  @JSImport("theo", "registerTransform")
  @js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: T, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  @JSImport("theo", "registerTransform")
  @js.native
  def registerTransform[T /* <: String */, V /* <: String */](name: Transform, valueTransforms: js.Array[V | ValueTransform]): Unit = js.native
  
  @JSImport("theo", "registerValueTransform")
  @js.native
  def registerValueTransform[T /* <: String */](
    name: T,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  @JSImport("theo", "registerValueTransform")
  @js.native
  def registerValueTransform[T /* <: String */](
    name: ValueTransform,
    predicate: js.Function1[/* prop */ Prop, Boolean],
    transform: js.Function1[/* prop */ Prop, String | Double]
  ): Unit = js.native
  
  type Aliases = OrderedMap[String, Map[String, String | Double]]
  
  @js.native
  trait ConvertOptions extends StObject {
    
    var format: FormatOptions = js.native
    
    var resolveAliases: js.UndefOr[Boolean] = js.native
    
    var resolveMetaAliases: js.UndefOr[Boolean] = js.native
    
    var transform: TransformOptions[scala.Nothing] = js.native
  }
  object ConvertOptions {
    
    @scala.inline
    def apply(format: FormatOptions, transform: TransformOptions[scala.Nothing]): ConvertOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvertOptions]
    }
    
    @scala.inline
    implicit class ConvertOptionsMutableBuilder[Self <: ConvertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: FormatOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveAliases(value: Boolean): Self = StObject.set(x, "resolveAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveAliasesUndefined: Self = StObject.set(x, "resolveAliases", js.undefined)
      
      @scala.inline
      def setResolveMetaAliases(value: Boolean): Self = StObject.set(x, "resolveMetaAliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveMetaAliasesUndefined: Self = StObject.set(x, "resolveMetaAliases", js.undefined)
      
      @scala.inline
      def setTransform(value: TransformOptions[scala.Nothing]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.theo.theoStrings.`custom-propertiesDotcss`
    - typingsSlinky.theo.theoStrings.cssmodulesDotcss
    - typingsSlinky.theo.theoStrings.scss
    - typingsSlinky.theo.theoStrings.sass
    - typingsSlinky.theo.theoStrings.less
    - typingsSlinky.theo.theoStrings.styl
    - typingsSlinky.theo.theoStrings.mapDotcss
    - typingsSlinky.theo.theoStrings.mapDotvariableDotscss
    - typingsSlinky.theo.theoStrings.listDotscss
    - typingsSlinky.theo.theoStrings.moduleDotjs
    - typingsSlinky.theo.theoStrings.commonDotjs
    - typingsSlinky.theo.theoStrings.html
    - typingsSlinky.theo.theoStrings.json
    - typingsSlinky.theo.theoStrings.rawDotjson
    - typingsSlinky.theo.theoStrings.iosDotjson
    - typingsSlinky.theo.theoStrings.androidDotxml
    - typingsSlinky.theo.theoStrings.auraDottokens
  */
  trait Format extends StObject
  object Format {
    
    @scala.inline
    def androidDotxml: typingsSlinky.theo.theoStrings.androidDotxml = "android.xml".asInstanceOf[typingsSlinky.theo.theoStrings.androidDotxml]
    
    @scala.inline
    def auraDottokens: typingsSlinky.theo.theoStrings.auraDottokens = "aura.tokens".asInstanceOf[typingsSlinky.theo.theoStrings.auraDottokens]
    
    @scala.inline
    def commonDotjs: typingsSlinky.theo.theoStrings.commonDotjs = "common.js".asInstanceOf[typingsSlinky.theo.theoStrings.commonDotjs]
    
    @scala.inline
    def cssmodulesDotcss: typingsSlinky.theo.theoStrings.cssmodulesDotcss = "cssmodules.css".asInstanceOf[typingsSlinky.theo.theoStrings.cssmodulesDotcss]
    
    @scala.inline
    def `custom-propertiesDotcss`: typingsSlinky.theo.theoStrings.`custom-propertiesDotcss` = "custom-properties.css".asInstanceOf[typingsSlinky.theo.theoStrings.`custom-propertiesDotcss`]
    
    @scala.inline
    def html: typingsSlinky.theo.theoStrings.html = "html".asInstanceOf[typingsSlinky.theo.theoStrings.html]
    
    @scala.inline
    def iosDotjson: typingsSlinky.theo.theoStrings.iosDotjson = "ios.json".asInstanceOf[typingsSlinky.theo.theoStrings.iosDotjson]
    
    @scala.inline
    def json: typingsSlinky.theo.theoStrings.json = "json".asInstanceOf[typingsSlinky.theo.theoStrings.json]
    
    @scala.inline
    def less: typingsSlinky.theo.theoStrings.less = "less".asInstanceOf[typingsSlinky.theo.theoStrings.less]
    
    @scala.inline
    def listDotscss: typingsSlinky.theo.theoStrings.listDotscss = "list.scss".asInstanceOf[typingsSlinky.theo.theoStrings.listDotscss]
    
    @scala.inline
    def mapDotcss: typingsSlinky.theo.theoStrings.mapDotcss = "map.css".asInstanceOf[typingsSlinky.theo.theoStrings.mapDotcss]
    
    @scala.inline
    def mapDotvariableDotscss: typingsSlinky.theo.theoStrings.mapDotvariableDotscss = "map.variable.scss".asInstanceOf[typingsSlinky.theo.theoStrings.mapDotvariableDotscss]
    
    @scala.inline
    def moduleDotjs: typingsSlinky.theo.theoStrings.moduleDotjs = "module.js".asInstanceOf[typingsSlinky.theo.theoStrings.moduleDotjs]
    
    @scala.inline
    def rawDotjson: typingsSlinky.theo.theoStrings.rawDotjson = "raw.json".asInstanceOf[typingsSlinky.theo.theoStrings.rawDotjson]
    
    @scala.inline
    def sass: typingsSlinky.theo.theoStrings.sass = "sass".asInstanceOf[typingsSlinky.theo.theoStrings.sass]
    
    @scala.inline
    def scss: typingsSlinky.theo.theoStrings.scss = "scss".asInstanceOf[typingsSlinky.theo.theoStrings.scss]
    
    @scala.inline
    def styl: typingsSlinky.theo.theoStrings.styl = "styl".asInstanceOf[typingsSlinky.theo.theoStrings.styl]
  }
  
  @js.native
  trait FormatOptions extends StObject {
    
    var options: js.UndefOr[
        js.Function2[
          /* options */ js.Object, 
          /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
          Unit
        ]
      ] = js.native
    
    var `type`: Format = js.native
  }
  object FormatOptions {
    
    @scala.inline
    def apply(`type`: Format): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit class FormatOptionsMutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(
        value: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Unit
      ): Self = StObject.set(x, "options", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setType(value: Format): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatResultFn = js.Function1[/* result */ ImmutableStyleMap, String]
  
  @js.native
  trait ImmutableStyleMap
    extends Map[String, js.Any] {
    
    @JSName("get")
    def get_aliases(key: aliases): Aliases = js.native
    @JSName("get")
    def get_global(key: global): js.UndefOr[Props] = js.native
    @JSName("get")
    def get_imports(key: imports): js.UndefOr[js.Array[String]] = js.native
    @JSName("get")
    def get_meta(key: meta): Meta = js.native
    @JSName("get")
    def get_options(key: options): js.Object = js.native
    @JSName("get")
    def get_props(key: props): Props = js.native
  }
  
  type Meta = Map[String, String]
  
  type Prop = Map[StyleProperty, String | Double]
  
  type Props = List[Prop]
  
  @js.native
  trait StyleMap extends StObject {
    
    var aliases: Aliases = js.native
    
    var global: js.UndefOr[Props] = js.native
    
    var imports: js.UndefOr[js.Array[String]] = js.native
    
    var meta: Meta = js.native
    
    var options: js.Object = js.native
    
    var props: Props = js.native
  }
  object StyleMap {
    
    @scala.inline
    def apply(aliases: Aliases, meta: Meta, options: js.Object, props: Props): StyleMap = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleMap]
    }
    
    @scala.inline
    implicit class StyleMapMutableBuilder[Self <: StyleMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Props): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      @scala.inline
      def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.theo.theoStrings.name
    - typingsSlinky.theo.theoStrings.value
    - typingsSlinky.theo.theoStrings.`type`
    - typingsSlinky.theo.theoStrings.originalValue
    - typingsSlinky.theo.theoStrings.category
    - typingsSlinky.theo.theoStrings.comment
    - typingsSlinky.theo.theoStrings.meta
  */
  trait StyleProperty extends StObject
  object StyleProperty {
    
    @scala.inline
    def category: typingsSlinky.theo.theoStrings.category = "category".asInstanceOf[typingsSlinky.theo.theoStrings.category]
    
    @scala.inline
    def comment: typingsSlinky.theo.theoStrings.comment = "comment".asInstanceOf[typingsSlinky.theo.theoStrings.comment]
    
    @scala.inline
    def meta: typingsSlinky.theo.theoStrings.meta = "meta".asInstanceOf[typingsSlinky.theo.theoStrings.meta]
    
    @scala.inline
    def name: typingsSlinky.theo.theoStrings.name = "name".asInstanceOf[typingsSlinky.theo.theoStrings.name]
    
    @scala.inline
    def originalValue: typingsSlinky.theo.theoStrings.originalValue = "originalValue".asInstanceOf[typingsSlinky.theo.theoStrings.originalValue]
    
    @scala.inline
    def `type`: typingsSlinky.theo.theoStrings.`type` = "type".asInstanceOf[typingsSlinky.theo.theoStrings.`type`]
    
    @scala.inline
    def value: typingsSlinky.theo.theoStrings.value = "value".asInstanceOf[typingsSlinky.theo.theoStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.theo.theoStrings.raw
    - typingsSlinky.theo.theoStrings.ios
    - typingsSlinky.theo.theoStrings.android
    - typingsSlinky.theo.theoStrings.web
  */
  trait Transform extends StObject
  object Transform {
    
    @scala.inline
    def android: typingsSlinky.theo.theoStrings.android = "android".asInstanceOf[typingsSlinky.theo.theoStrings.android]
    
    @scala.inline
    def ios: typingsSlinky.theo.theoStrings.ios = "ios".asInstanceOf[typingsSlinky.theo.theoStrings.ios]
    
    @scala.inline
    def raw: typingsSlinky.theo.theoStrings.raw = "raw".asInstanceOf[typingsSlinky.theo.theoStrings.raw]
    
    @scala.inline
    def web: typingsSlinky.theo.theoStrings.web = "web".asInstanceOf[typingsSlinky.theo.theoStrings.web]
  }
  
  @js.native
  trait TransformOptions[T /* <: String */] extends StObject {
    
    var data: js.UndefOr[String] = js.native
    
    var file: String = js.native
    
    var `type`: js.UndefOr[Transform | T] = js.native
  }
  object TransformOptions {
    
    @scala.inline
    def apply[T /* <: String */](file: String): TransformOptions[T] = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions[T]]
    }
    
    @scala.inline
    implicit class TransformOptionsMutableBuilder[Self <: TransformOptions[_], T /* <: String */] (val x: Self with TransformOptions[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Transform | T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.theo.theoStrings.colorSlashrgb
    - typingsSlinky.theo.theoStrings.colorSlashhex
    - typingsSlinky.theo.theoStrings.colorSlashhex8rgba
    - typingsSlinky.theo.theoStrings.colorSlashhex8argb
    - typingsSlinky.theo.theoStrings.percentageSlashfloat
    - typingsSlinky.theo.theoStrings.relativeSlashpixel
    - typingsSlinky.theo.theoStrings.relativeSlashpixelValue
  */
  trait ValueTransform extends StObject
  object ValueTransform {
    
    @scala.inline
    def colorSlashhex: typingsSlinky.theo.theoStrings.colorSlashhex = "color/hex".asInstanceOf[typingsSlinky.theo.theoStrings.colorSlashhex]
    
    @scala.inline
    def colorSlashhex8argb: typingsSlinky.theo.theoStrings.colorSlashhex8argb = "color/hex8argb".asInstanceOf[typingsSlinky.theo.theoStrings.colorSlashhex8argb]
    
    @scala.inline
    def colorSlashhex8rgba: typingsSlinky.theo.theoStrings.colorSlashhex8rgba = "color/hex8rgba".asInstanceOf[typingsSlinky.theo.theoStrings.colorSlashhex8rgba]
    
    @scala.inline
    def colorSlashrgb: typingsSlinky.theo.theoStrings.colorSlashrgb = "color/rgb".asInstanceOf[typingsSlinky.theo.theoStrings.colorSlashrgb]
    
    @scala.inline
    def percentageSlashfloat: typingsSlinky.theo.theoStrings.percentageSlashfloat = "percentage/float".asInstanceOf[typingsSlinky.theo.theoStrings.percentageSlashfloat]
    
    @scala.inline
    def relativeSlashpixel: typingsSlinky.theo.theoStrings.relativeSlashpixel = "relative/pixel".asInstanceOf[typingsSlinky.theo.theoStrings.relativeSlashpixel]
    
    @scala.inline
    def relativeSlashpixelValue: typingsSlinky.theo.theoStrings.relativeSlashpixelValue = "relative/pixelValue".asInstanceOf[typingsSlinky.theo.theoStrings.relativeSlashpixelValue]
  }
}
