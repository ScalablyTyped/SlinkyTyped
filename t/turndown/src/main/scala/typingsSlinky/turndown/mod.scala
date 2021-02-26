package typingsSlinky.turndown

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.turndown.turndownStrings.Asterisk
import typingsSlinky.turndown.turndownStrings.AsteriskAsterisk
import typingsSlinky.turndown.turndownStrings.GraveaccentGraveaccentGraveaccent
import typingsSlinky.turndown.turndownStrings.Plussign
import typingsSlinky.turndown.turndownStrings.TildeTildeTilde
import typingsSlinky.turndown.turndownStrings.__
import typingsSlinky.turndown.turndownStrings._underscore
import typingsSlinky.turndown.turndownStrings.`-_`
import typingsSlinky.turndown.turndownStrings.atx
import typingsSlinky.turndown.turndownStrings.collapsed
import typingsSlinky.turndown.turndownStrings.fenced
import typingsSlinky.turndown.turndownStrings.full
import typingsSlinky.turndown.turndownStrings.indented
import typingsSlinky.turndown.turndownStrings.inlined
import typingsSlinky.turndown.turndownStrings.referenced
import typingsSlinky.turndown.turndownStrings.setext
import typingsSlinky.turndown.turndownStrings.shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("turndown", JSImport.Namespace)
  @js.native
  class ^ () extends TurndownService {
    def this(options: Options) = this()
  }
  
  type Filter = TagName | js.Array[TagName] | FilterFunction
  
  type FilterFunction = js.Function2[/* node */ HTMLElement, /* options */ Options, Boolean]
  
  type Node = HTMLElement | Document | DocumentFragment
  
  @js.native
  trait Options extends StObject {
    
    var blankReplacement: js.UndefOr[ReplacementFunction] = js.native
    
    var br: js.UndefOr[String] = js.native
    
    var bulletListMarker: js.UndefOr[`-_` | Plussign | Asterisk] = js.native
    
    var codeBlockStyle: js.UndefOr[indented | fenced] = js.native
    
    var defaultReplacement: js.UndefOr[ReplacementFunction] = js.native
    
    var emDelimiter: js.UndefOr[_underscore | Asterisk] = js.native
    
    var fence: js.UndefOr[GraveaccentGraveaccentGraveaccent | TildeTildeTilde] = js.native
    
    var headingStyle: js.UndefOr[setext | atx] = js.native
    
    var hr: js.UndefOr[String] = js.native
    
    var keepReplacement: js.UndefOr[ReplacementFunction] = js.native
    
    var linkReferenceStyle: js.UndefOr[full | collapsed | shortcut] = js.native
    
    var linkStyle: js.UndefOr[inlined | referenced] = js.native
    
    var strongDelimiter: js.UndefOr[__ | AsteriskAsterisk] = js.native
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
      def setBlankReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "blankReplacement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBlankReplacementUndefined: Self = StObject.set(x, "blankReplacement", js.undefined)
      
      @scala.inline
      def setBr(value: String): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setBulletListMarker(value: `-_` | Plussign | Asterisk): Self = StObject.set(x, "bulletListMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletListMarkerUndefined: Self = StObject.set(x, "bulletListMarker", js.undefined)
      
      @scala.inline
      def setCodeBlockStyle(value: indented | fenced): Self = StObject.set(x, "codeBlockStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeBlockStyleUndefined: Self = StObject.set(x, "codeBlockStyle", js.undefined)
      
      @scala.inline
      def setDefaultReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "defaultReplacement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDefaultReplacementUndefined: Self = StObject.set(x, "defaultReplacement", js.undefined)
      
      @scala.inline
      def setEmDelimiter(value: _underscore | Asterisk): Self = StObject.set(x, "emDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmDelimiterUndefined: Self = StObject.set(x, "emDelimiter", js.undefined)
      
      @scala.inline
      def setFence(value: GraveaccentGraveaccentGraveaccent | TildeTildeTilde): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
      
      @scala.inline
      def setHeadingStyle(value: setext | atx): Self = StObject.set(x, "headingStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadingStyleUndefined: Self = StObject.set(x, "headingStyle", js.undefined)
      
      @scala.inline
      def setHr(value: String): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setKeepReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "keepReplacement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setKeepReplacementUndefined: Self = StObject.set(x, "keepReplacement", js.undefined)
      
      @scala.inline
      def setLinkReferenceStyle(value: full | collapsed | shortcut): Self = StObject.set(x, "linkReferenceStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkReferenceStyleUndefined: Self = StObject.set(x, "linkReferenceStyle", js.undefined)
      
      @scala.inline
      def setLinkStyle(value: inlined | referenced): Self = StObject.set(x, "linkStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkStyleUndefined: Self = StObject.set(x, "linkStyle", js.undefined)
      
      @scala.inline
      def setStrongDelimiter(value: __ | AsteriskAsterisk): Self = StObject.set(x, "strongDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongDelimiterUndefined: Self = StObject.set(x, "strongDelimiter", js.undefined)
    }
  }
  
  type Plugin = js.Function1[/* service */ TurndownService, Unit]
  
  type ReplacementFunction = js.Function3[/* content */ String, /* node */ Node, /* options */ Options, String]
  
  @js.native
  trait Rule extends StObject {
    
    var filter: Filter = js.native
    
    var replacement: js.UndefOr[ReplacementFunction] = js.native
  }
  object Rule {
    
    @scala.inline
    def apply(filter: Filter): Rule = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    @scala.inline
    implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction2(value: (/* node */ HTMLElement, /* options */ Options) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterVarargs(value: TagName*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = StObject.set(x, "replacement", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
  
  @js.native
  trait Rules extends StObject {
    
    def add(key: Filter, rule: Rule): Unit = js.native
    
    var array: js.Array[Rule] = js.native
    
    def blankRule(content: String, node: Node, options: Options): String = js.native
    @JSName("blankRule")
    var blankRule_Original: ReplacementFunction = js.native
    
    def defaultRule(content: String, node: Node, options: Options): String = js.native
    @JSName("defaultRule")
    var defaultRule_Original: ReplacementFunction = js.native
    
    def forEach(callback: js.Function2[/* rule */ Rule, /* index */ Double, _]): Unit = js.native
    
    def forNode(node: Node): Rule = js.native
    
    def keep(filter: Filter): Unit = js.native
    
    def keepReplacement(content: String, node: Node, options: Options): String = js.native
    @JSName("keepReplacement")
    var keepReplacement_Original: ReplacementFunction = js.native
    
    var options: Options = js.native
    
    def remove(filter: Filter): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.turndown.turndownStrings.a
    - typingsSlinky.turndown.turndownStrings.abbr
    - typingsSlinky.turndown.turndownStrings.address
    - typingsSlinky.turndown.turndownStrings.applet
    - typingsSlinky.turndown.turndownStrings.area
    - typingsSlinky.turndown.turndownStrings.article
    - typingsSlinky.turndown.turndownStrings.aside
    - typingsSlinky.turndown.turndownStrings.audio
    - typingsSlinky.turndown.turndownStrings.b
    - typingsSlinky.turndown.turndownStrings.base
    - typingsSlinky.turndown.turndownStrings.basefont
    - typingsSlinky.turndown.turndownStrings.bdi
    - typingsSlinky.turndown.turndownStrings.bdo
    - typingsSlinky.turndown.turndownStrings.blockquote
    - typingsSlinky.turndown.turndownStrings.body
    - typingsSlinky.turndown.turndownStrings.br
    - typingsSlinky.turndown.turndownStrings.button
    - typingsSlinky.turndown.turndownStrings.canvas
    - typingsSlinky.turndown.turndownStrings.caption
    - typingsSlinky.turndown.turndownStrings.cite
    - typingsSlinky.turndown.turndownStrings.code
    - typingsSlinky.turndown.turndownStrings.col
    - typingsSlinky.turndown.turndownStrings.colgroup
    - typingsSlinky.turndown.turndownStrings.data
    - typingsSlinky.turndown.turndownStrings.datalist
    - typingsSlinky.turndown.turndownStrings.dd
    - typingsSlinky.turndown.turndownStrings.del
    - typingsSlinky.turndown.turndownStrings.details
    - typingsSlinky.turndown.turndownStrings.dfn
    - typingsSlinky.turndown.turndownStrings.dialog
    - typingsSlinky.turndown.turndownStrings.dir
    - typingsSlinky.turndown.turndownStrings.div
    - typingsSlinky.turndown.turndownStrings.dl
    - typingsSlinky.turndown.turndownStrings.dt
    - typingsSlinky.turndown.turndownStrings.em
    - typingsSlinky.turndown.turndownStrings.embed
    - typingsSlinky.turndown.turndownStrings.fieldset
    - typingsSlinky.turndown.turndownStrings.figcaption
    - typingsSlinky.turndown.turndownStrings.figure
    - typingsSlinky.turndown.turndownStrings.font
    - typingsSlinky.turndown.turndownStrings.footer
    - typingsSlinky.turndown.turndownStrings.form
    - typingsSlinky.turndown.turndownStrings.frame
    - typingsSlinky.turndown.turndownStrings.frameset
    - typingsSlinky.turndown.turndownStrings.h1
    - typingsSlinky.turndown.turndownStrings.h2
    - typingsSlinky.turndown.turndownStrings.h3
    - typingsSlinky.turndown.turndownStrings.h4
    - typingsSlinky.turndown.turndownStrings.h5
    - typingsSlinky.turndown.turndownStrings.h6
    - typingsSlinky.turndown.turndownStrings.head
    - typingsSlinky.turndown.turndownStrings.header
    - typingsSlinky.turndown.turndownStrings.hgroup
    - typingsSlinky.turndown.turndownStrings.hr
    - typingsSlinky.turndown.turndownStrings.html
    - typingsSlinky.turndown.turndownStrings.i
    - typingsSlinky.turndown.turndownStrings.iframe
    - typingsSlinky.turndown.turndownStrings.img
    - typingsSlinky.turndown.turndownStrings.input
    - typingsSlinky.turndown.turndownStrings.ins
    - typingsSlinky.turndown.turndownStrings.kbd
    - typingsSlinky.turndown.turndownStrings.label
    - typingsSlinky.turndown.turndownStrings.legend
    - typingsSlinky.turndown.turndownStrings.li
    - typingsSlinky.turndown.turndownStrings.link
    - typingsSlinky.turndown.turndownStrings.main
    - typingsSlinky.turndown.turndownStrings.map
    - typingsSlinky.turndown.turndownStrings.mark
    - typingsSlinky.turndown.turndownStrings.marquee
    - typingsSlinky.turndown.turndownStrings.menu
    - typingsSlinky.turndown.turndownStrings.meta
    - typingsSlinky.turndown.turndownStrings.meter
    - typingsSlinky.turndown.turndownStrings.nav
    - typingsSlinky.turndown.turndownStrings.noscript
    - typingsSlinky.turndown.turndownStrings.`object`
    - typingsSlinky.turndown.turndownStrings.ol
    - typingsSlinky.turndown.turndownStrings.optgroup
    - typingsSlinky.turndown.turndownStrings.option
    - typingsSlinky.turndown.turndownStrings.output
    - typingsSlinky.turndown.turndownStrings.p
    - typingsSlinky.turndown.turndownStrings.param
    - typingsSlinky.turndown.turndownStrings.picture
    - typingsSlinky.turndown.turndownStrings.pre
    - typingsSlinky.turndown.turndownStrings.progress
    - typingsSlinky.turndown.turndownStrings.q
    - typingsSlinky.turndown.turndownStrings.rp
    - typingsSlinky.turndown.turndownStrings.rt
    - typingsSlinky.turndown.turndownStrings.ruby
    - typingsSlinky.turndown.turndownStrings.s
    - typingsSlinky.turndown.turndownStrings.samp
    - typingsSlinky.turndown.turndownStrings.script
    - typingsSlinky.turndown.turndownStrings.section
    - typingsSlinky.turndown.turndownStrings.select
    - typingsSlinky.turndown.turndownStrings.slot
    - typingsSlinky.turndown.turndownStrings.small
    - typingsSlinky.turndown.turndownStrings.source
    - typingsSlinky.turndown.turndownStrings.span
    - typingsSlinky.turndown.turndownStrings.strong
    - typingsSlinky.turndown.turndownStrings.style
    - typingsSlinky.turndown.turndownStrings.sub
    - typingsSlinky.turndown.turndownStrings.summary
    - typingsSlinky.turndown.turndownStrings.sup
    - typingsSlinky.turndown.turndownStrings.table
    - typingsSlinky.turndown.turndownStrings.tbody
    - typingsSlinky.turndown.turndownStrings.td
    - typingsSlinky.turndown.turndownStrings.template
    - typingsSlinky.turndown.turndownStrings.textarea
    - typingsSlinky.turndown.turndownStrings.tfoot
    - typingsSlinky.turndown.turndownStrings.th
    - typingsSlinky.turndown.turndownStrings.thead
    - typingsSlinky.turndown.turndownStrings.time
    - typingsSlinky.turndown.turndownStrings.title
    - typingsSlinky.turndown.turndownStrings.tr
    - typingsSlinky.turndown.turndownStrings.track
    - typingsSlinky.turndown.turndownStrings.u
    - typingsSlinky.turndown.turndownStrings.ul
    - typingsSlinky.turndown.turndownStrings.`var`
    - typingsSlinky.turndown.turndownStrings.video
    - typingsSlinky.turndown.turndownStrings.wbr
  */
  trait TagName extends StObject
  
  @js.native
  trait TurndownService extends StObject {
    
    def addRule(key: String, rule: Rule): this.type = js.native
    
    def escape(str: String): String = js.native
    
    def keep(filter: Filter): this.type = js.native
    
    var options: Options = js.native
    
    def remove(filter: Filter): this.type = js.native
    
    var rules: Rules = js.native
    
    def turndown(html: String): String = js.native
    def turndown(html: Node): String = js.native
    
    def use(plugins: js.Array[Plugin]): this.type = js.native
    def use(plugins: Plugin): this.type = js.native
  }
}
