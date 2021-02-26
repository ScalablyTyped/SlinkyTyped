package typingsSlinky.wordpressDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLAreaElement
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLBRElement
import org.scalajs.dom.raw.HTMLBaseElement
import org.scalajs.dom.raw.HTMLBodyElement
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLDListElement
import org.scalajs.dom.raw.HTMLDataListElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLEmbedElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLHRElement
import org.scalajs.dom.raw.HTMLHeadElement
import org.scalajs.dom.raw.HTMLHeadingElement
import org.scalajs.dom.raw.HTMLHtmlElement
import org.scalajs.dom.raw.HTMLIFrameElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLLegendElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMapElement
import org.scalajs.dom.raw.HTMLMenuElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLModElement
import org.scalajs.dom.raw.HTMLOListElement
import org.scalajs.dom.raw.HTMLObjectElement
import org.scalajs.dom.raw.HTMLOptGroupElement
import org.scalajs.dom.raw.HTMLOptionElement
import org.scalajs.dom.raw.HTMLParagraphElement
import org.scalajs.dom.raw.HTMLParamElement
import org.scalajs.dom.raw.HTMLPreElement
import org.scalajs.dom.raw.HTMLProgressElement
import org.scalajs.dom.raw.HTMLQuoteElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSourceElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLStyleElement
import org.scalajs.dom.raw.HTMLTableCaptionElement
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.ParentNode
import org.scalajs.dom.raw.Range
import typingsSlinky.std.DOMRect
import typingsSlinky.std.HTMLAppletElement
import typingsSlinky.std.HTMLBaseFontElement
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDetailsElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLDirectoryElement
import typingsSlinky.std.HTMLFontElement
import typingsSlinky.std.HTMLFrameElement
import typingsSlinky.std.HTMLFrameSetElement
import typingsSlinky.std.HTMLMarqueeElement
import typingsSlinky.std.HTMLMeterElement
import typingsSlinky.std.HTMLOutputElement
import typingsSlinky.std.HTMLPictureElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.HTMLTimeElement
import typingsSlinky.wordpressDom.wordpressDomStrings.`object`
import typingsSlinky.wordpressDom.wordpressDomStrings.`var`
import typingsSlinky.wordpressDom.wordpressDomStrings.a
import typingsSlinky.wordpressDom.wordpressDomStrings.abbr
import typingsSlinky.wordpressDom.wordpressDomStrings.address
import typingsSlinky.wordpressDom.wordpressDomStrings.applet
import typingsSlinky.wordpressDom.wordpressDomStrings.area
import typingsSlinky.wordpressDom.wordpressDomStrings.article
import typingsSlinky.wordpressDom.wordpressDomStrings.aside
import typingsSlinky.wordpressDom.wordpressDomStrings.audio
import typingsSlinky.wordpressDom.wordpressDomStrings.b
import typingsSlinky.wordpressDom.wordpressDomStrings.base
import typingsSlinky.wordpressDom.wordpressDomStrings.basefont
import typingsSlinky.wordpressDom.wordpressDomStrings.bdi
import typingsSlinky.wordpressDom.wordpressDomStrings.bdo
import typingsSlinky.wordpressDom.wordpressDomStrings.blockquote
import typingsSlinky.wordpressDom.wordpressDomStrings.body
import typingsSlinky.wordpressDom.wordpressDomStrings.br
import typingsSlinky.wordpressDom.wordpressDomStrings.button
import typingsSlinky.wordpressDom.wordpressDomStrings.canvas
import typingsSlinky.wordpressDom.wordpressDomStrings.caption
import typingsSlinky.wordpressDom.wordpressDomStrings.cite
import typingsSlinky.wordpressDom.wordpressDomStrings.code
import typingsSlinky.wordpressDom.wordpressDomStrings.col
import typingsSlinky.wordpressDom.wordpressDomStrings.colgroup
import typingsSlinky.wordpressDom.wordpressDomStrings.data
import typingsSlinky.wordpressDom.wordpressDomStrings.datalist
import typingsSlinky.wordpressDom.wordpressDomStrings.dd
import typingsSlinky.wordpressDom.wordpressDomStrings.del
import typingsSlinky.wordpressDom.wordpressDomStrings.details
import typingsSlinky.wordpressDom.wordpressDomStrings.dfn
import typingsSlinky.wordpressDom.wordpressDomStrings.dialog
import typingsSlinky.wordpressDom.wordpressDomStrings.dir
import typingsSlinky.wordpressDom.wordpressDomStrings.div
import typingsSlinky.wordpressDom.wordpressDomStrings.dl
import typingsSlinky.wordpressDom.wordpressDomStrings.dt
import typingsSlinky.wordpressDom.wordpressDomStrings.em
import typingsSlinky.wordpressDom.wordpressDomStrings.embed
import typingsSlinky.wordpressDom.wordpressDomStrings.fieldset
import typingsSlinky.wordpressDom.wordpressDomStrings.figcaption
import typingsSlinky.wordpressDom.wordpressDomStrings.figure
import typingsSlinky.wordpressDom.wordpressDomStrings.font
import typingsSlinky.wordpressDom.wordpressDomStrings.footer
import typingsSlinky.wordpressDom.wordpressDomStrings.form
import typingsSlinky.wordpressDom.wordpressDomStrings.frame
import typingsSlinky.wordpressDom.wordpressDomStrings.frameset
import typingsSlinky.wordpressDom.wordpressDomStrings.h1
import typingsSlinky.wordpressDom.wordpressDomStrings.h2
import typingsSlinky.wordpressDom.wordpressDomStrings.h3
import typingsSlinky.wordpressDom.wordpressDomStrings.h4
import typingsSlinky.wordpressDom.wordpressDomStrings.h5
import typingsSlinky.wordpressDom.wordpressDomStrings.h6
import typingsSlinky.wordpressDom.wordpressDomStrings.head
import typingsSlinky.wordpressDom.wordpressDomStrings.header
import typingsSlinky.wordpressDom.wordpressDomStrings.hgroup
import typingsSlinky.wordpressDom.wordpressDomStrings.hr
import typingsSlinky.wordpressDom.wordpressDomStrings.html
import typingsSlinky.wordpressDom.wordpressDomStrings.i
import typingsSlinky.wordpressDom.wordpressDomStrings.iframe
import typingsSlinky.wordpressDom.wordpressDomStrings.img
import typingsSlinky.wordpressDom.wordpressDomStrings.input
import typingsSlinky.wordpressDom.wordpressDomStrings.ins
import typingsSlinky.wordpressDom.wordpressDomStrings.kbd
import typingsSlinky.wordpressDom.wordpressDomStrings.label
import typingsSlinky.wordpressDom.wordpressDomStrings.legend
import typingsSlinky.wordpressDom.wordpressDomStrings.li
import typingsSlinky.wordpressDom.wordpressDomStrings.link
import typingsSlinky.wordpressDom.wordpressDomStrings.main
import typingsSlinky.wordpressDom.wordpressDomStrings.map
import typingsSlinky.wordpressDom.wordpressDomStrings.mark
import typingsSlinky.wordpressDom.wordpressDomStrings.marquee
import typingsSlinky.wordpressDom.wordpressDomStrings.menu
import typingsSlinky.wordpressDom.wordpressDomStrings.meta
import typingsSlinky.wordpressDom.wordpressDomStrings.meter
import typingsSlinky.wordpressDom.wordpressDomStrings.nav
import typingsSlinky.wordpressDom.wordpressDomStrings.noscript
import typingsSlinky.wordpressDom.wordpressDomStrings.ol
import typingsSlinky.wordpressDom.wordpressDomStrings.optgroup
import typingsSlinky.wordpressDom.wordpressDomStrings.option
import typingsSlinky.wordpressDom.wordpressDomStrings.output
import typingsSlinky.wordpressDom.wordpressDomStrings.p
import typingsSlinky.wordpressDom.wordpressDomStrings.param
import typingsSlinky.wordpressDom.wordpressDomStrings.picture
import typingsSlinky.wordpressDom.wordpressDomStrings.pre
import typingsSlinky.wordpressDom.wordpressDomStrings.progress
import typingsSlinky.wordpressDom.wordpressDomStrings.q
import typingsSlinky.wordpressDom.wordpressDomStrings.rp
import typingsSlinky.wordpressDom.wordpressDomStrings.rt
import typingsSlinky.wordpressDom.wordpressDomStrings.ruby
import typingsSlinky.wordpressDom.wordpressDomStrings.s
import typingsSlinky.wordpressDom.wordpressDomStrings.samp
import typingsSlinky.wordpressDom.wordpressDomStrings.script
import typingsSlinky.wordpressDom.wordpressDomStrings.section
import typingsSlinky.wordpressDom.wordpressDomStrings.select
import typingsSlinky.wordpressDom.wordpressDomStrings.slot
import typingsSlinky.wordpressDom.wordpressDomStrings.small
import typingsSlinky.wordpressDom.wordpressDomStrings.source
import typingsSlinky.wordpressDom.wordpressDomStrings.span
import typingsSlinky.wordpressDom.wordpressDomStrings.strong
import typingsSlinky.wordpressDom.wordpressDomStrings.style
import typingsSlinky.wordpressDom.wordpressDomStrings.sub
import typingsSlinky.wordpressDom.wordpressDomStrings.summary
import typingsSlinky.wordpressDom.wordpressDomStrings.sup
import typingsSlinky.wordpressDom.wordpressDomStrings.table
import typingsSlinky.wordpressDom.wordpressDomStrings.tbody
import typingsSlinky.wordpressDom.wordpressDomStrings.td
import typingsSlinky.wordpressDom.wordpressDomStrings.template
import typingsSlinky.wordpressDom.wordpressDomStrings.textarea
import typingsSlinky.wordpressDom.wordpressDomStrings.tfoot
import typingsSlinky.wordpressDom.wordpressDomStrings.th
import typingsSlinky.wordpressDom.wordpressDomStrings.thead
import typingsSlinky.wordpressDom.wordpressDomStrings.time
import typingsSlinky.wordpressDom.wordpressDomStrings.title
import typingsSlinky.wordpressDom.wordpressDomStrings.tr
import typingsSlinky.wordpressDom.wordpressDomStrings.track
import typingsSlinky.wordpressDom.wordpressDomStrings.u
import typingsSlinky.wordpressDom.wordpressDomStrings.ul
import typingsSlinky.wordpressDom.wordpressDomStrings.video
import typingsSlinky.wordpressDom.wordpressDomStrings.wbr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/dom", "computeCaretRect")
  @js.native
  def computeCaretRect(): js.UndefOr[DOMRect] = js.native
  
  @JSImport("@wordpress/dom", "documentHasSelection")
  @js.native
  def documentHasSelection(): Boolean = js.native
  
  object focus {
    
    @JSImport("@wordpress/dom", "focus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/dom", "focus.focusable")
    @js.native
    def focusable: Focusable = js.native
    @scala.inline
    def focusable_=(x: Focusable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusable")(x.asInstanceOf[js.Any])
    
    @JSImport("@wordpress/dom", "focus.tabbable")
    @js.native
    def tabbable: Tabbable = js.native
    @scala.inline
    def tabbable_=(x: Tabbable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabbable")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@wordpress/dom", "getOffsetParent")
  @js.native
  def getOffsetParent(node: Node): Element | Null = js.native
  
  @JSImport("@wordpress/dom", "getRectangleFromRange")
  @js.native
  def getRectangleFromRange(range: Range): DOMRect = js.native
  
  @JSImport("@wordpress/dom", "getScrollContainer")
  @js.native
  def getScrollContainer(element: Element): js.UndefOr[Element] = js.native
  
  @JSImport("@wordpress/dom", "insertAfter")
  @js.native
  def insertAfter(newNode: Node, referenceNode: Node): Unit = js.native
  
  @JSImport("@wordpress/dom", "isEntirelySelected")
  @js.native
  def isEntirelySelected(element: HTMLElement): Boolean = js.native
  
  @JSImport("@wordpress/dom", "isHorizontalEdge")
  @js.native
  def isHorizontalEdge(container: HTMLElement, isReverse: Boolean): Boolean = js.native
  
  @JSImport("@wordpress/dom", "isTextField")
  @js.native
  def isTextField(element: HTMLElement): Boolean = js.native
  
  @JSImport("@wordpress/dom", "isVerticalEdge")
  @js.native
  def isVerticalEdge(container: HTMLElement, isReverse: Boolean): Boolean = js.native
  
  @JSImport("@wordpress/dom", "placeCaretAtHorizontalEdge")
  @js.native
  def placeCaretAtHorizontalEdge(container: js.UndefOr[scala.Nothing], isReverse: Boolean): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtHorizontalEdge")
  @js.native
  def placeCaretAtHorizontalEdge(container: HTMLElement, isReverse: Boolean): Unit = js.native
  
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: js.UndefOr[scala.Nothing], isReverse: Boolean): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(
    container: js.UndefOr[scala.Nothing],
    isReverse: Boolean,
    rect: js.UndefOr[scala.Nothing],
    mayUseScroll: Boolean
  ): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: js.UndefOr[scala.Nothing], isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: js.UndefOr[scala.Nothing], mayUseScroll: Boolean): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = js.native
  @JSImport("@wordpress/dom", "placeCaretAtVerticalEdge")
  @js.native
  def placeCaretAtVerticalEdge(container: HTMLElement, isReverse: Boolean, rect: DOMRect, mayUseScroll: Boolean): Unit = js.native
  
  @JSImport("@wordpress/dom", "remove")
  @js.native
  def remove(node: Node): Unit = js.native
  
  @JSImport("@wordpress/dom", "replace")
  @js.native
  def replace(processedNode: Node, newNode: Node): Unit = js.native
  
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_a(node: Node, tagName: a): HTMLAnchorElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_abbr(node: Node, tagName: abbr): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_address(node: Node, tagName: address): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_applet(node: Node, tagName: applet): HTMLAppletElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_area(node: Node, tagName: area): HTMLAreaElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_article(node: Node, tagName: article): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_aside(node: Node, tagName: aside): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_audio(node: Node, tagName: audio): HTMLAudioElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_b(node: Node, tagName: b): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_base(node: Node, tagName: base): HTMLBaseElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_basefont(node: Node, tagName: basefont): HTMLBaseFontElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_bdi(node: Node, tagName: bdi): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_bdo(node: Node, tagName: bdo): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_blockquote(node: Node, tagName: blockquote): HTMLQuoteElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_body(node: Node, tagName: body): HTMLBodyElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_br(node: Node, tagName: br): HTMLBRElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_button(node: Node, tagName: button): HTMLButtonElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_canvas(node: Node, tagName: canvas): HTMLCanvasElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_caption(node: Node, tagName: caption): HTMLTableCaptionElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_cite(node: Node, tagName: cite): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_code(node: Node, tagName: code): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_col(node: Node, tagName: col): HTMLTableColElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_colgroup(node: Node, tagName: colgroup): HTMLTableColElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_data(node: Node, tagName: data): HTMLDataElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_datalist(node: Node, tagName: datalist): HTMLDataListElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dd(node: Node, tagName: dd): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_del(node: Node, tagName: del): HTMLModElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_details(node: Node, tagName: details): HTMLDetailsElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dfn(node: Node, tagName: dfn): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dialog(node: Node, tagName: dialog): HTMLDialogElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dir(node: Node, tagName: dir): HTMLDirectoryElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_div(node: Node, tagName: div): HTMLDivElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dl(node: Node, tagName: dl): HTMLDListElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_dt(node: Node, tagName: dt): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_em(node: Node, tagName: em): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_embed(node: Node, tagName: embed): HTMLEmbedElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_fieldset(node: Node, tagName: fieldset): HTMLFieldSetElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_figcaption(node: Node, tagName: figcaption): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_figure(node: Node, tagName: figure): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_font(node: Node, tagName: font): HTMLFontElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_footer(node: Node, tagName: footer): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_form(node: Node, tagName: form): HTMLFormElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_frame(node: Node, tagName: frame): HTMLFrameElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_frameset(node: Node, tagName: frameset): HTMLFrameSetElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h1(node: Node, tagName: h1): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h2(node: Node, tagName: h2): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h3(node: Node, tagName: h3): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h4(node: Node, tagName: h4): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h5(node: Node, tagName: h5): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_h6(node: Node, tagName: h6): HTMLHeadingElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_head(node: Node, tagName: head): HTMLHeadElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_header(node: Node, tagName: header): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_hgroup(node: Node, tagName: hgroup): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_hr(node: Node, tagName: hr): HTMLHRElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_html(node: Node, tagName: html): HTMLHtmlElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_i(node: Node, tagName: i): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_iframe(node: Node, tagName: iframe): HTMLIFrameElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_img(node: Node, tagName: img): HTMLImageElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_input(node: Node, tagName: input): HTMLInputElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_ins(node: Node, tagName: ins): HTMLModElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_kbd(node: Node, tagName: kbd): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_label(node: Node, tagName: label): HTMLLabelElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_legend(node: Node, tagName: legend): HTMLLegendElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_li(node: Node, tagName: li): HTMLLIElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_link(node: Node, tagName: link): HTMLLinkElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_main(node: Node, tagName: main): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_map(node: Node, tagName: map): HTMLMapElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_mark(node: Node, tagName: mark): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_marquee(node: Node, tagName: marquee): HTMLMarqueeElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_menu(node: Node, tagName: menu): HTMLMenuElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_meta(node: Node, tagName: meta): HTMLMetaElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_meter(node: Node, tagName: meter): HTMLMeterElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_nav(node: Node, tagName: nav): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_noscript(node: Node, tagName: noscript): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_object(node: Node, tagName: `object`): HTMLObjectElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_ol(node: Node, tagName: ol): HTMLOListElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_optgroup(node: Node, tagName: optgroup): HTMLOptGroupElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_option(node: Node, tagName: option): HTMLOptionElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_output(node: Node, tagName: output): HTMLOutputElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_p(node: Node, tagName: p): HTMLParagraphElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_param(node: Node, tagName: param): HTMLParamElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_picture(node: Node, tagName: picture): HTMLPictureElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_pre(node: Node, tagName: pre): HTMLPreElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_progress(node: Node, tagName: progress): HTMLProgressElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_q(node: Node, tagName: q): HTMLQuoteElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_rp(node: Node, tagName: rp): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_rt(node: Node, tagName: rt): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_ruby(node: Node, tagName: ruby): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_s(node: Node, tagName: s): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_samp(node: Node, tagName: samp): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_script(node: Node, tagName: script): HTMLScriptElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_section(node: Node, tagName: section): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_select(node: Node, tagName: select): HTMLSelectElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_slot(node: Node, tagName: slot): HTMLSlotElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_small(node: Node, tagName: small): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_source(node: Node, tagName: source): HTMLSourceElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_span(node: Node, tagName: span): HTMLSpanElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_strong(node: Node, tagName: strong): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_style(node: Node, tagName: style): HTMLStyleElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_sub(node: Node, tagName: sub): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_summary(node: Node, tagName: summary): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_sup(node: Node, tagName: sup): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_table(node: Node, tagName: table): HTMLTableElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_tbody(node: Node, tagName: tbody): HTMLTableSectionElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_td(node: Node, tagName: td): HTMLTableDataCellElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_template(node: Node, tagName: template): HTMLTemplateElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_textarea(node: Node, tagName: textarea): HTMLTextAreaElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_tfoot(node: Node, tagName: tfoot): HTMLTableSectionElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_th(node: Node, tagName: th): HTMLTableHeaderCellElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_thead(node: Node, tagName: thead): HTMLTableSectionElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_time(node: Node, tagName: time): HTMLTimeElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_title(node: Node, tagName: title): HTMLTitleElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_tr(node: Node, tagName: tr): HTMLTableRowElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_track(node: Node, tagName: track): HTMLTrackElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_u(node: Node, tagName: u): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_ul(node: Node, tagName: ul): HTMLUListElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_var(node: Node, tagName: `var`): HTMLElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_video(node: Node, tagName: video): HTMLVideoElement = js.native
  @JSImport("@wordpress/dom", "replaceTag")
  @js.native
  def replaceTag_wbr(node: Node, tagName: wbr): HTMLElement = js.native
  
  @JSImport("@wordpress/dom", "unwrap")
  @js.native
  def unwrap(node: Node): Unit = js.native
  
  @JSImport("@wordpress/dom", "wrap")
  @js.native
  def wrap(newNode: Node, referenceNode: Node): Unit = js.native
  
  @js.native
  trait Focusable extends StObject {
    
    def find(context: ParentNode): js.Array[Element] = js.native
  }
  object Focusable {
    
    @scala.inline
    def apply(find: ParentNode => js.Array[Element]): Focusable = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
      __obj.asInstanceOf[Focusable]
    }
    
    @scala.inline
    implicit class FocusableMutableBuilder[Self <: Focusable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFind(value: ParentNode => js.Array[Element]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Tabbable extends Focusable {
    
    /**
      * Returns `true` if the specified element is tabbable, or `false` otherwise.
      *
      * @param element - Element to test.
      */
    def isTabbableIndex(element: Element): Boolean = js.native
  }
  object Tabbable {
    
    @scala.inline
    def apply(find: ParentNode => js.Array[Element], isTabbableIndex: Element => Boolean): Tabbable = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
      __obj.asInstanceOf[Tabbable]
    }
    
    @scala.inline
    implicit class TabbableMutableBuilder[Self <: Tabbable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsTabbableIndex(value: Element => Boolean): Self = StObject.set(x, "isTabbableIndex", js.Any.fromFunction1(value))
    }
  }
}
