package typingsSlinky.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactChild
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlocks.anon.Attributetypeboolean
import typingsSlinky.wordpressBlocks.mod.Block
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute
import typingsSlinky.wordpressBlocks.parserMod.Schema.Children
import typingsSlinky.wordpressBlocks.parserMod.Schema.HTML
import typingsSlinky.wordpressBlocks.parserMod.Schema.Node
import typingsSlinky.wordpressBlocks.parserMod.Schema.Query
import typingsSlinky.wordpressBlocks.parserMod.Schema.Tag
import typingsSlinky.wordpressBlocks.parserMod.Schema.Text
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.attribute
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.boolean
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.children
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.node
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.query_
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.string
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tag
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, _] = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, _]): Record[String, _] = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String): js.Any = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, _]): js.Any = js.native
  
  @JSImport("@wordpress/blocks/api/parser", "parse")
  @js.native
  def parse(content: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Node): ReactElement | Null = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema[T /* <: Record[String, Source[_]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with TopLevel[T] = js.native
  
  object Schema {
    
    @js.native
    trait Attribute
      extends Source[js.Any] {
      
      var attribute: String = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: attribute = js.native
      
      var `type`: js.UndefOr[string | boolean] = js.native
    }
    object Attribute {
      
      @scala.inline
      def apply(attribute: String, source: attribute): Attribute = {
        val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attribute]
      }
      
      @scala.inline
      implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: string | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Children
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: children = js.native
    }
    object Children {
      
      @scala.inline
      def apply(source: children): Children = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Children]
      }
      
      @scala.inline
      implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HTML
      extends Source[js.Any] {
      
      var multiline: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
          ] = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: html = js.native
    }
    object HTML {
      
      @scala.inline
      def apply(source: html): HTML = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTML]
      }
      
      @scala.inline
      implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMultiline(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Node
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: node = js.native
    }
    object Node {
      
      @scala.inline
      def apply(source: node): Node = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Query[T] extends Source[T] {
      
      var query: T = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: query_ = js.native
    }
    object Query {
      
      @scala.inline
      def apply[T](query: T, source: query_): Query[T] = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Query[T]]
      }
      
      @scala.inline
      implicit class QueryMutableBuilder[Self <: Query[_], T] (val x: Self with Query[T]) extends AnyVal {
        
        @scala.inline
        def setQuery(value: T): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: query_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Tag
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: tag = js.native
    }
    object Tag {
      
      @scala.inline
      def apply(source: tag): Tag = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Tag]
      }
      
      @scala.inline
      implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: tag): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Text
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: text = js.native
    }
    object Text {
      
      @scala.inline
      def apply(source: text): Text = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
      
      @scala.inline
      implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Children
    - typingsSlinky.wordpressBlocks.parserMod.Schema.HTML
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Node
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Query[T]
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Tag
    - typingsSlinky.wordpressBlocks.parserMod.Schema.Text
  */
  trait Source[T] extends StObject
  object Source {
    
    @scala.inline
    def Attribute(attribute: String, source: attribute): typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Attribute]
    }
    
    @scala.inline
    def Children(source: children): typingsSlinky.wordpressBlocks.parserMod.Schema.Children = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Children]
    }
    
    @scala.inline
    def HTML(source: html): typingsSlinky.wordpressBlocks.parserMod.Schema.HTML = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.HTML]
    }
    
    @scala.inline
    def Node(source: node): typingsSlinky.wordpressBlocks.parserMod.Schema.Node = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Node]
    }
    
    @scala.inline
    def Query[T](query: T, source: query_): typingsSlinky.wordpressBlocks.parserMod.Schema.Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Query[T]]
    }
    
    @scala.inline
    def Tag(source: tag): typingsSlinky.wordpressBlocks.parserMod.Schema.Tag = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Tag]
    }
    
    @scala.inline
    def Text(source: text): typingsSlinky.wordpressBlocks.parserMod.Schema.Text = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.wordpressBlocks.parserMod.Schema.Text]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof any ]: any[k] extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer V>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<@wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<V>> * / object : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<U[k]> * / object}
    * / typingsSlinky.wordpressBlocks.wordpressBlocksStrings.SourceReturnValue with org.scalablytyped.runtime.TopLevel[js.Any]
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.a
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.abbr
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.address
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.applet
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.area
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.article
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.aside
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.audio
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.b
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.base
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.basefont
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.bdi
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.bdo
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.blockquote
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.body
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.br
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.button
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.canvas
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.caption
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.cite
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.code
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.col
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.colgroup
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.data
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.datalist
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dd
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.del
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.details
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dfn
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dialog
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dir
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.div
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dl
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dt
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.em
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.embed
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.fieldset
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.figcaption
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.figure
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.font
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.footer
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.form
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.frame
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.frameset
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h1
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h2
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h3
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h4
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h5
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.h6
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.head
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.header
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.hgroup
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.hr
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.html
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.i
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.iframe
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.img
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.input
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ins
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.kbd
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.label
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.legend
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.li
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.link
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.main
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.map
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.mark
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.marquee
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.menu
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.meta
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.meter
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.nav
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.noscript
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.`object`
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ol
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.optgroup
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.option
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.output
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.p
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.param
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.picture
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.pre
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.progress
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.q
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.rp
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.rt
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ruby
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.s
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.samp
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.script
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.section
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.select
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.slot
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.small
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.source
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.span
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.strong
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.style
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.sub
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.summary
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.sup
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.table
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tbody
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.td
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.template
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.textarea
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tfoot
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.th
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.thead
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.time
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.title
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tr
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.track
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.u
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ul
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.`var`
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.video
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.wbr
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.circle
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.clipPath
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.defs
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.desc
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ellipse
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feBlend
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feColorMatrix
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feComponentTransfer
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feComposite
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feConvolveMatrix
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feDiffuseLighting
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feDisplacementMap
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feDistantLight
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feFlood
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feFuncA
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feFuncB
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feFuncG
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feFuncR
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feGaussianBlur
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feImage
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feMerge
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feMergeNode
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feMorphology
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feOffset
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.fePointLight
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feSpecularLighting
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feSpotLight
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feTile
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.feTurbulence
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.filter
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.foreignObject
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.g
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.image
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.line
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.linearGradient
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.marker
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.mask
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.metadata
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.path
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.pattern
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.polygon
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.polyline
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.radialGradient
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.rect
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.stop
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.svg
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.switch
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.symbol
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.textPath
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.tspan
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.use
    - typingsSlinky.wordpressBlocks.wordpressBlocksStrings.view
    - typingsSlinky.react.mod.global.JSX.Element
    - scala.Null
    - js.Array[typingsSlinky.react.mod.ReactChild]
    - scala.Boolean
  */
  type SourceReturnValue[T] = js.UndefOr[
    _SourceReturnValue[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof any ]: any[k] extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer V>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<@wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<V>> * / object : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<U[k]> * / object}
    */ typingsSlinky.wordpressBlocks.wordpressBlocksStrings.SourceReturnValue with TopLevel[js.Any]) | js.Array[ReactChild] | String | ReactElement | Null | Boolean
  ]
  
  trait _SourceReturnValue[T] extends StObject
}
