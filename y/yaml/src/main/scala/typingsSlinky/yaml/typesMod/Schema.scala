package typingsSlinky.yaml.typesMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.yaml.anon.MAP
import typingsSlinky.yaml.mod.Document
import typingsSlinky.yaml.typesMod.Schema.CreateNodeContext
import typingsSlinky.yaml.typesMod.Schema.Name
import typingsSlinky.yaml.typesMod.Schema.Options
import typingsSlinky.yaml.typesMod.Schema.Tag
import typingsSlinky.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Schema")
@js.native
class Schema protected () extends StObject {
  def this(options: Options) = this()
  
  /**
    * Convert any value into a `Node` using this schema, recursively turning
    * objects into collections.
    *
    * @param wrapScalars If `true`, also wraps plain values in `Scalar` objects;
    *   if undefined or `false` and `value` is not an object, it will be returned
    *   directly.
    * @param tag Use to specify the collection type, e.g. `"!!omap"`. Note that
    *   this requires the corresponding tag to be available in this schema.
    */
  def createNode(value: js.Any): Node = js.native
  def createNode(
    value: js.Any,
    wrapScalars: js.UndefOr[scala.Nothing],
    tag: js.UndefOr[scala.Nothing],
    ctx: CreateNodeContext
  ): Node = js.native
  def createNode(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: js.UndefOr[scala.Nothing], tag: String, ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: js.UndefOr[scala.Nothing], ctx: CreateNodeContext): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String): Node = js.native
  def createNode(value: js.Any, wrapScalars: Boolean, tag: String, ctx: CreateNodeContext): Node = js.native
  
  /**
    * Convert a key and a value into a `Pair` using this schema, recursively
    * wrapping all values as `Scalar` or `Collection` nodes.
    *
    * @param ctx To not wrap scalars, use a context `{ wrapScalars: false }`
    */
  def createPair(key: js.Any, value: js.Any): Pair = js.native
  def createPair(key: js.Any, value: js.Any, ctx: CreateNodeContext): Pair = js.native
  
  var merge: Boolean = js.native
  
  var name: Name = js.native
  
  var sortMapEntries: (js.Function2[/* a */ Pair, /* b */ Pair, Double]) | Null = js.native
  
  var tags: js.Array[Tag] = js.native
}
/* static members */
object Schema {
  
  @JSImport("yaml/types", "Schema")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default: `'tag:yaml.org,2002:'` */
  @JSImport("yaml/types", "Schema.defaultPrefix")
  @js.native
  def defaultPrefix: String = js.native
  @scala.inline
  def defaultPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultPrefix")(x.asInstanceOf[js.Any])
  
  @JSImport("yaml/types", "Schema.defaultTags")
  @js.native
  def defaultTags: MAP = js.native
  @scala.inline
  def defaultTags_=(x: MAP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTags")(x.asInstanceOf[js.Any])
  
  @js.native
  trait BaseTag extends StObject {
    
    /**
      * An optional factory function, used e.g. by collections when wrapping JS objects as AST nodes.
      */
    var createNode: js.UndefOr[
        js.Function3[
          /* schema */ Schema, 
          /* value */ js.Any, 
          /* ctx */ CreateNodeContext, 
          YAMLMap | YAMLSeq | Scalar
        ]
      ] = js.native
    
    /**
      * If a tag has multiple forms that should be parsed and/or stringified differently, use `format` to identify them.
      */
    var format: js.UndefOr[String] = js.native
    
    /**
      * Used by `YAML.createNode` to detect your data type, e.g. using `typeof` or
      * `instanceof`.
      */
    def identify(value: js.Any): Boolean = js.native
    
    /**
      * The `Node` child class that implements this tag. Required for collections and tags that have overlapping JS representations.
      */
    var nodeClass: js.UndefOr[Instantiable0[js.Any]] = js.native
    
    /**
      * Used by some tags to configure their stringification, where applicable.
      */
    var options: js.UndefOr[js.Object] = js.native
    
    /**
      * Optional function stringifying the AST node in the current context. If your
      * data includes a suitable `.toString()` method, you can probably leave this
      * undefined and use the default stringifier.
      *
      * @param item The node being stringified.
      * @param ctx Contains the stringifying context variables.
      * @param onComment Callback to signal that the stringifier includes the
      *   item's comment in its output.
      * @param onChompKeep Callback to signal that the output uses a block scalar
      *   type with the `+` chomping indicator.
      */
    var stringify: js.UndefOr[
        js.Function4[
          /* item */ Node, 
          /* ctx */ StringifyContext, 
          /* onComment */ js.UndefOr[js.Function0[Unit]], 
          /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
          String
        ]
      ] = js.native
    
    /**
      * The identifier for your data type, with which its stringified form will be
      * prefixed. Should either be a !-prefixed local `!tag`, or a fully qualified
      * `tag:domain,date:foo`.
      */
    var tag: String = js.native
  }
  object BaseTag {
    
    @scala.inline
    def apply(identify: js.Any => Boolean, tag: String): BaseTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTag]
    }
    
    @scala.inline
    implicit class BaseTagMutableBuilder[Self <: BaseTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateNode(
        value: (/* schema */ Schema, /* value */ js.Any, /* ctx */ CreateNodeContext) => YAMLMap | YAMLSeq | Scalar
      ): Self = StObject.set(x, "createNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIdentify(value: js.Any => Boolean): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeClass(value: Instantiable0[js.Any]): Self = StObject.set(x, "nodeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeClassUndefined: Self = StObject.set(x, "nodeClass", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStringify(
        value: (/* item */ Node, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
      ): Self = StObject.set(x, "stringify", js.Any.fromFunction4(value))
      
      @scala.inline
      def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateNodeContext
    extends /* key */ StringDictionary[js.Any] {
    
    var wrapScalars: js.UndefOr[Boolean] = js.native
  }
  object CreateNodeContext {
    
    @scala.inline
    def apply(): CreateNodeContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateNodeContext]
    }
    
    @scala.inline
    implicit class CreateNodeContextMutableBuilder[Self <: CreateNodeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrapScalars(value: Boolean): Self = StObject.set(x, "wrapScalars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapScalarsUndefined: Self = StObject.set(x, "wrapScalars", js.undefined)
    }
  }
  
  @js.native
  trait CustomTag
    extends BaseTag
       with Tag {
    
    /**
      * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
      * @deprecated Use `Tag.identify` instead
      */
    var `class`: js.UndefOr[Instantiable0[js.Any]] = js.native
    
    /**
      * Turns a CST node into an AST node. If returning a non-`Node` value, the
      * output will be wrapped as a `Scalar`.
      */
    def resolve(doc: Document, cstNode: typingsSlinky.yaml.parseCstMod.CST.Node): Node | js.Any = js.native
  }
  object CustomTag {
    
    @scala.inline
    def apply(
      identify: js.Any => Boolean,
      resolve: (Document, typingsSlinky.yaml.parseCstMod.CST.Node) => Node | js.Any,
      tag: String
    ): CustomTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomTag]
    }
    
    @scala.inline
    implicit class CustomTagMutableBuilder[Self <: CustomTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: Instantiable0[js.Any]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setResolve(value: (Document, typingsSlinky.yaml.parseCstMod.CST.Node) => Node | js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DefaultTag
    extends BaseTag
       with Tag {
    
    /**
      * If `true`, together with `test` allows for values to be stringified without
      * an explicit tag. For most cases, it's unlikely that you'll actually want to
      * use this, even if you first think you do.
      */
    var default: `true` = js.native
    
    /**
      * Alternative form used by default tags; called with `test` match results.
      */
    def resolve(`match`: String*): Node | js.Any = js.native
    
    /**
      * Together with `default` allows for values to be stringified without an
      * explicit tag and detected using a regular expression. For most cases, it's
      * unlikely that you'll actually want to use these, even if you first think
      * you do.
      */
    var test: js.RegExp = js.native
  }
  object DefaultTag {
    
    @scala.inline
    def apply(
      default: `true`,
      identify: js.Any => Boolean,
      resolve: /* repeated */ String => Node | js.Any,
      tag: String,
      test: js.RegExp
    ): DefaultTag = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTag]
    }
    
    @scala.inline
    implicit class DefaultTagMutableBuilder[Self <: DefaultTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: `true`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: /* repeated */ String => Node | js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTest(value: js.RegExp): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.yaml.yamlStrings.core
    - typingsSlinky.yaml.yamlStrings.failsafe
    - typingsSlinky.yaml.yamlStrings.json
    - typingsSlinky.yaml.yamlStrings.`yaml-1Dot1`
  */
  trait Name extends StObject
  object Name {
    
    @scala.inline
    def core: typingsSlinky.yaml.yamlStrings.core = "core".asInstanceOf[typingsSlinky.yaml.yamlStrings.core]
    
    @scala.inline
    def failsafe: typingsSlinky.yaml.yamlStrings.failsafe = "failsafe".asInstanceOf[typingsSlinky.yaml.yamlStrings.failsafe]
    
    @scala.inline
    def json: typingsSlinky.yaml.yamlStrings.json = "json".asInstanceOf[typingsSlinky.yaml.yamlStrings.json]
    
    @scala.inline
    def `yaml-1Dot1`: typingsSlinky.yaml.yamlStrings.`yaml-1Dot1` = "yaml-1.1".asInstanceOf[typingsSlinky.yaml.yamlStrings.`yaml-1Dot1`]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Array of additional tags to include in the schema, or a function that may
      * modify the schema's base tag array.
      */
    var customTags: js.UndefOr[
        (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
      ] = js.native
    
    /**
      * Enable support for `<<` merge keys.
      *
      * Default: `false` for YAML 1.2, `true` for earlier versions
      */
    var merge: js.UndefOr[Boolean] = js.native
    
    /**
      * The base schema to use.
      *
      * Default: `"core"` for YAML 1.2, `"yaml-1.1"` for earlier versions
      */
    var schema: js.UndefOr[Name] = js.native
    
    /**
      * When stringifying, sort map entries. If `true`, sort by comparing key values with `<`.
      *
      * Default: `false`
      */
    var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])] = js.native
    
    /**
      * @deprecated Use `customTags` instead.
      */
    var tags: js.UndefOr[
        (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
      ] = js.native
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
      def setCustomTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = StObject.set(x, "customTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = StObject.set(x, "customTags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomTagsUndefined: Self = StObject.set(x, "customTags", js.undefined)
      
      @scala.inline
      def setCustomTagsVarargs(value: (TagId | Tag)*): Self = StObject.set(x, "customTags", js.Array(value :_*))
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
      
      @scala.inline
      def setSchema(value: Name): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setSortMapEntries(value: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])): Self = StObject.set(x, "sortMapEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortMapEntriesFunction2(value: (/* a */ Pair, /* b */ Pair) => Double): Self = StObject.set(x, "sortMapEntries", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortMapEntriesUndefined: Self = StObject.set(x, "sortMapEntries", js.undefined)
      
      @scala.inline
      def setTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = StObject.set(x, "tags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: (TagId | Tag)*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StringifyContext
    extends /* key */ StringDictionary[js.Any] {
    
    var forceBlockIndent: js.UndefOr[Boolean] = js.native
    
    var implicitKey: js.UndefOr[Boolean] = js.native
    
    var inFlow: js.UndefOr[Boolean] = js.native
    
    var indent: js.UndefOr[String] = js.native
    
    var indentAtStart: js.UndefOr[Double] = js.native
  }
  object StringifyContext {
    
    @scala.inline
    def apply(): StringifyContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyContext]
    }
    
    @scala.inline
    implicit class StringifyContextMutableBuilder[Self <: StringifyContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceBlockIndent(value: Boolean): Self = StObject.set(x, "forceBlockIndent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBlockIndentUndefined: Self = StObject.set(x, "forceBlockIndent", js.undefined)
      
      @scala.inline
      def setImplicitKey(value: Boolean): Self = StObject.set(x, "implicitKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplicitKeyUndefined: Self = StObject.set(x, "implicitKey", js.undefined)
      
      @scala.inline
      def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFlowUndefined: Self = StObject.set(x, "inFlow", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentAtStart(value: Double): Self = StObject.set(x, "indentAtStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentAtStartUndefined: Self = StObject.set(x, "indentAtStart", js.undefined)
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.yaml.typesMod.Schema.CustomTag
    - typingsSlinky.yaml.typesMod.Schema.DefaultTag
  */
  trait Tag extends StObject
  object Tag {
    
    @scala.inline
    def CustomTag(
      identify: js.Any => Boolean,
      resolve: (Document, typingsSlinky.yaml.parseCstMod.CST.Node) => Node | js.Any,
      tag: String
    ): typingsSlinky.yaml.typesMod.Schema.CustomTag = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.yaml.typesMod.Schema.CustomTag]
    }
    
    @scala.inline
    def DefaultTag(
      default: `true`,
      identify: js.Any => Boolean,
      resolve: /* repeated */ String => Node | js.Any,
      tag: String,
      test: js.RegExp
    ): typingsSlinky.yaml.typesMod.Schema.DefaultTag = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction1(resolve), tag = tag.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.yaml.typesMod.Schema.DefaultTag]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.yaml.yamlStrings.binary
    - typingsSlinky.yaml.yamlStrings.bool
    - typingsSlinky.yaml.yamlStrings.float
    - typingsSlinky.yaml.yamlStrings.floatExp
    - typingsSlinky.yaml.yamlStrings.floatNaN
    - typingsSlinky.yaml.yamlStrings.floatTime
    - typingsSlinky.yaml.yamlStrings.int
    - typingsSlinky.yaml.yamlStrings.intHex
    - typingsSlinky.yaml.yamlStrings.intOct
    - typingsSlinky.yaml.yamlStrings.intTime
    - typingsSlinky.yaml.yamlStrings.`null`
    - typingsSlinky.yaml.yamlStrings.omap
    - typingsSlinky.yaml.yamlStrings.pairs
    - typingsSlinky.yaml.yamlStrings.set
    - typingsSlinky.yaml.yamlStrings.timestamp
  */
  trait TagId extends StObject
  object TagId {
    
    @scala.inline
    def binary: typingsSlinky.yaml.yamlStrings.binary = "binary".asInstanceOf[typingsSlinky.yaml.yamlStrings.binary]
    
    @scala.inline
    def bool: typingsSlinky.yaml.yamlStrings.bool = "bool".asInstanceOf[typingsSlinky.yaml.yamlStrings.bool]
    
    @scala.inline
    def float: typingsSlinky.yaml.yamlStrings.float = "float".asInstanceOf[typingsSlinky.yaml.yamlStrings.float]
    
    @scala.inline
    def floatExp: typingsSlinky.yaml.yamlStrings.floatExp = "floatExp".asInstanceOf[typingsSlinky.yaml.yamlStrings.floatExp]
    
    @scala.inline
    def floatNaN: typingsSlinky.yaml.yamlStrings.floatNaN = "floatNaN".asInstanceOf[typingsSlinky.yaml.yamlStrings.floatNaN]
    
    @scala.inline
    def floatTime: typingsSlinky.yaml.yamlStrings.floatTime = "floatTime".asInstanceOf[typingsSlinky.yaml.yamlStrings.floatTime]
    
    @scala.inline
    def int: typingsSlinky.yaml.yamlStrings.int = "int".asInstanceOf[typingsSlinky.yaml.yamlStrings.int]
    
    @scala.inline
    def intHex: typingsSlinky.yaml.yamlStrings.intHex = "intHex".asInstanceOf[typingsSlinky.yaml.yamlStrings.intHex]
    
    @scala.inline
    def intOct: typingsSlinky.yaml.yamlStrings.intOct = "intOct".asInstanceOf[typingsSlinky.yaml.yamlStrings.intOct]
    
    @scala.inline
    def intTime: typingsSlinky.yaml.yamlStrings.intTime = "intTime".asInstanceOf[typingsSlinky.yaml.yamlStrings.intTime]
    
    @scala.inline
    def `null`: typingsSlinky.yaml.yamlStrings.`null` = "null".asInstanceOf[typingsSlinky.yaml.yamlStrings.`null`]
    
    @scala.inline
    def omap: typingsSlinky.yaml.yamlStrings.omap = "omap".asInstanceOf[typingsSlinky.yaml.yamlStrings.omap]
    
    @scala.inline
    def pairs: typingsSlinky.yaml.yamlStrings.pairs = "pairs".asInstanceOf[typingsSlinky.yaml.yamlStrings.pairs]
    
    @scala.inline
    def set: typingsSlinky.yaml.yamlStrings.set = "set".asInstanceOf[typingsSlinky.yaml.yamlStrings.set]
    
    @scala.inline
    def timestamp: typingsSlinky.yaml.yamlStrings.timestamp = "timestamp".asInstanceOf[typingsSlinky.yaml.yamlStrings.timestamp]
  }
}
