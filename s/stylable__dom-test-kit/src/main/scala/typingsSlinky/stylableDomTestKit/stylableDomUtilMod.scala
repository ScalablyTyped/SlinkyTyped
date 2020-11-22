package typingsSlinky.stylableDomTestKit

import org.scalajs.dom.raw.DOMTokenList
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
import org.scalajs.dom.raw.NodeListOf
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGEllipseElement
import org.scalajs.dom.raw.SVGFEBlendElement
import org.scalajs.dom.raw.SVGFEColorMatrixElement
import org.scalajs.dom.raw.SVGFEComponentTransferElement
import org.scalajs.dom.raw.SVGFECompositeElement
import org.scalajs.dom.raw.SVGFEConvolveMatrixElement
import org.scalajs.dom.raw.SVGFEDiffuseLightingElement
import org.scalajs.dom.raw.SVGFEDisplacementMapElement
import org.scalajs.dom.raw.SVGFEDistantLightElement
import org.scalajs.dom.raw.SVGFEFloodElement
import org.scalajs.dom.raw.SVGFEFuncAElement
import org.scalajs.dom.raw.SVGFEFuncBElement
import org.scalajs.dom.raw.SVGFEFuncGElement
import org.scalajs.dom.raw.SVGFEFuncRElement
import org.scalajs.dom.raw.SVGFEGaussianBlurElement
import org.scalajs.dom.raw.SVGFEImageElement
import org.scalajs.dom.raw.SVGFEMergeElement
import org.scalajs.dom.raw.SVGFEMergeNodeElement
import org.scalajs.dom.raw.SVGFEMorphologyElement
import org.scalajs.dom.raw.SVGFEOffsetElement
import org.scalajs.dom.raw.SVGFEPointLightElement
import org.scalajs.dom.raw.SVGFESpecularLightingElement
import org.scalajs.dom.raw.SVGFESpotLightElement
import org.scalajs.dom.raw.SVGFETileElement
import org.scalajs.dom.raw.SVGFETurbulenceElement
import org.scalajs.dom.raw.SVGFilterElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGImageElement
import org.scalajs.dom.raw.SVGLineElement
import org.scalajs.dom.raw.SVGLinearGradientElement
import org.scalajs.dom.raw.SVGMarkerElement
import org.scalajs.dom.raw.SVGMaskElement
import org.scalajs.dom.raw.SVGMetadataElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPatternElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGPolylineElement
import org.scalajs.dom.raw.SVGRadialGradientElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import org.scalajs.dom.raw.SVGStopElement
import org.scalajs.dom.raw.SVGSwitchElement
import org.scalajs.dom.raw.SVGSymbolElement
import org.scalajs.dom.raw.SVGTSpanElement
import org.scalajs.dom.raw.SVGTextElement
import org.scalajs.dom.raw.SVGTextPathElement
import org.scalajs.dom.raw.SVGUseElement
import org.scalajs.dom.raw.SVGViewElement
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
import typingsSlinky.std.SVGForeignObjectElement
import typingsSlinky.stylableDomTestKit.anon.FnCall
import typingsSlinky.stylableDomTestKit.anon.FnCallSelectors
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.`object`
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.`var`
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.a
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.abbr
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.address
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.applet
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.area
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.article
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.aside
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.audio
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.b
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.base
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.basefont
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.bdi
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.bdo
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.blockquote
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.body
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.br
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.button
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.canvas
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.caption
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.circle
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.cite
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.clipPath
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.code
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.col
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.colgroup
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.data
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.datalist
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dd
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.defs
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.del
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.desc
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.details
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dfn
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dialog
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dir
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.div
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dl
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.dt
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.ellipse
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.em
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.embed
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feBlend
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feColorMatrix
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feComponentTransfer
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feComposite
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feConvolveMatrix
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feDiffuseLighting
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feDisplacementMap
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feDistantLight
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feFlood
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feFuncA
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feFuncB
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feFuncG
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feFuncR
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feGaussianBlur
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feImage
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feMerge
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feMergeNode
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feMorphology
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feOffset
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.fePointLight
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feSpecularLighting
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feSpotLight
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feTile
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.feTurbulence
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.fieldset
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.figcaption
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.figure
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.filter
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.font
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.footer
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.foreignObject
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.form
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.frame
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.frameset
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.g
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h1
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h2
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h3
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h4
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h5
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.h6
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.head
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.header
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.hgroup
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.hr
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.html
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.i
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.iframe
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.image
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.img
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.input
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.ins
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.kbd
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.label
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.legend
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.li
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.line
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.linearGradient
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.link
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.main
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.map
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.mark
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.marker
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.marquee
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.mask
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.menu
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.meta
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.metadata
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.meter
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.nav
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.noscript
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.ol
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.optgroup
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.option
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.output
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.p
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.param
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.path
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.pattern
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.picture
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.polygon
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.polyline
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.pre
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.progress
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.q
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.radialGradient
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.rect
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.rp
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.rt
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.ruby
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.s
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.samp
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.script
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.section
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.select
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.slot
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.small
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.source
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.span
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.stop
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.strong
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.style
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.sub
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.summary
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.sup
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.svg
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.switch
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.symbol
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.table
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.tbody
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.td
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.template
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.text
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.textPath
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.textarea
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.tfoot
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.th
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.thead
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.time
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.title
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.tr
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.track
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.tspan
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.u
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.ul
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.use
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.video
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.view
import typingsSlinky.stylableDomTestKit.stylableDomTestKitStrings.wbr
import typingsSlinky.stylableRuntime.typesMod.RuntimeStylesheet
import typingsSlinky.stylableRuntime.typesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/dom-test-kit/cjs/stylable-dom-util", JSImport.Namespace)
@js.native
object stylableDomUtilMod extends js.Object {
  
  @js.native
  trait PartialElement extends js.Object {
    
    var classList: DOMTokenList = js.native
    
    var className: String = js.native
    
    def querySelector[E /* <: Element */](selectors: String): E | Null = js.native
    
    def querySelectorAll[E /* <: Element */](selectors: String): NodeListOf[E with Node] = js.native
    @JSName("querySelectorAll")
    var querySelectorAll_Original: FnCallSelectors = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_a(selectors: a): NodeListOf[HTMLAnchorElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_abbr(selectors: abbr): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_address(selectors: address): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_applet(selectors: applet): NodeListOf[HTMLAppletElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_area(selectors: area): NodeListOf[HTMLAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_article(selectors: article): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_aside(selectors: aside): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_audio(selectors: audio): NodeListOf[HTMLAudioElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_b(selectors: b): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_base(selectors: base): NodeListOf[HTMLBaseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_basefont(selectors: basefont): NodeListOf[HTMLBaseFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdi(selectors: bdi): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_bdo(selectors: bdo): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_blockquote(selectors: blockquote): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_body(selectors: body): NodeListOf[HTMLBodyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_br(selectors: br): NodeListOf[HTMLBRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_button(selectors: button): NodeListOf[HTMLButtonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_canvas(selectors: canvas): NodeListOf[HTMLCanvasElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_caption(selectors: caption): NodeListOf[HTMLTableCaptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_circle(selectors: circle): NodeListOf[SVGCircleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_cite(selectors: cite): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_clipPath(selectors: clipPath): NodeListOf[SVGClipPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_code(selectors: code): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_col(selectors: col): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_colgroup(selectors: colgroup): NodeListOf[HTMLTableColElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_data(selectors: data): NodeListOf[HTMLDataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_datalist(selectors: datalist): NodeListOf[HTMLDataListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dd(selectors: dd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_defs(selectors: defs): NodeListOf[SVGDefsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_del(selectors: del): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_desc(selectors: desc): NodeListOf[SVGDescElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_details(selectors: details): NodeListOf[HTMLDetailsElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dfn(selectors: dfn): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dialog(selectors: dialog): NodeListOf[HTMLDialogElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dir(selectors: dir): NodeListOf[HTMLDirectoryElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_div(selectors: div): NodeListOf[HTMLDivElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dl(selectors: dl): NodeListOf[HTMLDListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_dt(selectors: dt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ellipse(selectors: ellipse): NodeListOf[SVGEllipseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_em(selectors: em): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_embed(selectors: embed): NodeListOf[HTMLEmbedElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feBlend(selectors: feBlend): NodeListOf[SVGFEBlendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feColorMatrix(selectors: feColorMatrix): NodeListOf[SVGFEColorMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComponentTransfer(selectors: feComponentTransfer): NodeListOf[SVGFEComponentTransferElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feComposite(selectors: feComposite): NodeListOf[SVGFECompositeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feConvolveMatrix(selectors: feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDiffuseLighting(selectors: feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDisplacementMap(selectors: feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feDistantLight(selectors: feDistantLight): NodeListOf[SVGFEDistantLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFlood(selectors: feFlood): NodeListOf[SVGFEFloodElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncA(selectors: feFuncA): NodeListOf[SVGFEFuncAElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncB(selectors: feFuncB): NodeListOf[SVGFEFuncBElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncG(selectors: feFuncG): NodeListOf[SVGFEFuncGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feFuncR(selectors: feFuncR): NodeListOf[SVGFEFuncRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feGaussianBlur(selectors: feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feImage(selectors: feImage): NodeListOf[SVGFEImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMerge(selectors: feMerge): NodeListOf[SVGFEMergeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMergeNode(selectors: feMergeNode): NodeListOf[SVGFEMergeNodeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feMorphology(selectors: feMorphology): NodeListOf[SVGFEMorphologyElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feOffset(selectors: feOffset): NodeListOf[SVGFEOffsetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fePointLight(selectors: fePointLight): NodeListOf[SVGFEPointLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpecularLighting(selectors: feSpecularLighting): NodeListOf[SVGFESpecularLightingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feSpotLight(selectors: feSpotLight): NodeListOf[SVGFESpotLightElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTile(selectors: feTile): NodeListOf[SVGFETileElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_feTurbulence(selectors: feTurbulence): NodeListOf[SVGFETurbulenceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_fieldset(selectors: fieldset): NodeListOf[HTMLFieldSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figcaption(selectors: figcaption): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_figure(selectors: figure): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_filter(selectors: filter): NodeListOf[SVGFilterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_font(selectors: font): NodeListOf[HTMLFontElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_footer(selectors: footer): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_foreignObject(selectors: foreignObject): NodeListOf[SVGForeignObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_form(selectors: form): NodeListOf[HTMLFormElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frame(selectors: frame): NodeListOf[HTMLFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_frameset(selectors: frameset): NodeListOf[HTMLFrameSetElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_g(selectors: g): NodeListOf[SVGGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h1(selectors: h1): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h2(selectors: h2): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h3(selectors: h3): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h4(selectors: h4): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h5(selectors: h5): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_h6(selectors: h6): NodeListOf[HTMLHeadingElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_head(selectors: head): NodeListOf[HTMLHeadElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_header(selectors: header): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hgroup(selectors: hgroup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_hr(selectors: hr): NodeListOf[HTMLHRElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_html(selectors: html): NodeListOf[HTMLHtmlElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_i(selectors: i): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_iframe(selectors: iframe): NodeListOf[HTMLIFrameElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_image(selectors: image): NodeListOf[SVGImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_img(selectors: img): NodeListOf[HTMLImageElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_input(selectors: input): NodeListOf[HTMLInputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ins(selectors: ins): NodeListOf[HTMLModElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_kbd(selectors: kbd): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_label(selectors: label): NodeListOf[HTMLLabelElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_legend(selectors: legend): NodeListOf[HTMLLegendElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_li(selectors: li): NodeListOf[HTMLLIElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_line(selectors: line): NodeListOf[SVGLineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_linearGradient(selectors: linearGradient): NodeListOf[SVGLinearGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_link(selectors: link): NodeListOf[HTMLLinkElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_main(selectors: main): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_map(selectors: map): NodeListOf[HTMLMapElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mark(selectors: mark): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marker(selectors: marker): NodeListOf[SVGMarkerElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_marquee(selectors: marquee): NodeListOf[HTMLMarqueeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_mask(selectors: mask): NodeListOf[SVGMaskElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_menu(selectors: menu): NodeListOf[HTMLMenuElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meta(selectors: meta): NodeListOf[HTMLMetaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_metadata(selectors: metadata): NodeListOf[SVGMetadataElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_meter(selectors: meter): NodeListOf[HTMLMeterElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_nav(selectors: nav): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_noscript(selectors: noscript): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_object(selectors: `object`): NodeListOf[HTMLObjectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ol(selectors: ol): NodeListOf[HTMLOListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_optgroup(selectors: optgroup): NodeListOf[HTMLOptGroupElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_option(selectors: option): NodeListOf[HTMLOptionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_output(selectors: output): NodeListOf[HTMLOutputElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_p(selectors: p): NodeListOf[HTMLParagraphElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_param(selectors: param): NodeListOf[HTMLParamElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_path(selectors: path): NodeListOf[SVGPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pattern(selectors: pattern): NodeListOf[SVGPatternElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_picture(selectors: picture): NodeListOf[HTMLPictureElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polygon(selectors: polygon): NodeListOf[SVGPolygonElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_polyline(selectors: polyline): NodeListOf[SVGPolylineElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_pre(selectors: pre): NodeListOf[HTMLPreElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_progress(selectors: progress): NodeListOf[HTMLProgressElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_q(selectors: q): NodeListOf[HTMLQuoteElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_radialGradient(selectors: radialGradient): NodeListOf[SVGRadialGradientElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rect(selectors: rect): NodeListOf[SVGRectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rp(selectors: rp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_rt(selectors: rt): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ruby(selectors: ruby): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_s(selectors: s): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_samp(selectors: samp): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_script(selectors: script): NodeListOf[HTMLScriptElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_section(selectors: section): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_select(selectors: select): NodeListOf[HTMLSelectElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_slot(selectors: slot): NodeListOf[HTMLSlotElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_small(selectors: small): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_source(selectors: source): NodeListOf[HTMLSourceElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_span(selectors: span): NodeListOf[HTMLSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_stop(selectors: stop): NodeListOf[SVGStopElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_strong(selectors: strong): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_style(selectors: style): NodeListOf[HTMLStyleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sub(selectors: sub): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_summary(selectors: summary): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_sup(selectors: sup): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_svg(selectors: svg): NodeListOf[SVGSVGElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_switch(selectors: switch): NodeListOf[SVGSwitchElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_symbol(selectors: symbol): NodeListOf[SVGSymbolElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_table(selectors: table): NodeListOf[HTMLTableElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tbody(selectors: tbody): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_td(selectors: td): NodeListOf[HTMLTableDataCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_template(selectors: template): NodeListOf[HTMLTemplateElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_text(selectors: text): NodeListOf[SVGTextElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textPath(selectors: textPath): NodeListOf[SVGTextPathElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_textarea(selectors: textarea): NodeListOf[HTMLTextAreaElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tfoot(selectors: tfoot): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_th(selectors: th): NodeListOf[HTMLTableHeaderCellElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_thead(selectors: thead): NodeListOf[HTMLTableSectionElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_time(selectors: time): NodeListOf[HTMLTimeElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_title(selectors: title): NodeListOf[HTMLTitleElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tr(selectors: tr): NodeListOf[HTMLTableRowElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_track(selectors: track): NodeListOf[HTMLTrackElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_tspan(selectors: tspan): NodeListOf[SVGTSpanElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_u(selectors: u): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_ul(selectors: ul): NodeListOf[HTMLUListElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_use(selectors: use): NodeListOf[SVGUseElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_var(selectors: `var`): NodeListOf[HTMLElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_video(selectors: video): NodeListOf[HTMLVideoElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_view(selectors: view): NodeListOf[SVGViewElement with Node] = js.native
    @JSName("querySelectorAll")
    def querySelectorAll_wbr(selectors: wbr): NodeListOf[HTMLElement with Node] = js.native
    
    @JSName("querySelector")
    var querySelector_Original: FnCall = js.native
    @JSName("querySelector")
    def querySelector_a(selectors: a): HTMLAnchorElement | Null = js.native
    @JSName("querySelector")
    def querySelector_abbr(selectors: abbr): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_address(selectors: address): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_applet(selectors: applet): HTMLAppletElement | Null = js.native
    @JSName("querySelector")
    def querySelector_area(selectors: area): HTMLAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_article(selectors: article): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_aside(selectors: aside): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_audio(selectors: audio): HTMLAudioElement | Null = js.native
    @JSName("querySelector")
    def querySelector_b(selectors: b): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_base(selectors: base): HTMLBaseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_basefont(selectors: basefont): HTMLBaseFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdi(selectors: bdi): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_bdo(selectors: bdo): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_blockquote(selectors: blockquote): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_body(selectors: body): HTMLBodyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_br(selectors: br): HTMLBRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_button(selectors: button): HTMLButtonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_canvas(selectors: canvas): HTMLCanvasElement | Null = js.native
    @JSName("querySelector")
    def querySelector_caption(selectors: caption): HTMLTableCaptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_circle(selectors: circle): SVGCircleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_cite(selectors: cite): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_clipPath(selectors: clipPath): SVGClipPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_code(selectors: code): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_col(selectors: col): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_colgroup(selectors: colgroup): HTMLTableColElement | Null = js.native
    @JSName("querySelector")
    def querySelector_data(selectors: data): HTMLDataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_datalist(selectors: datalist): HTMLDataListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dd(selectors: dd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_defs(selectors: defs): SVGDefsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_del(selectors: del): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_desc(selectors: desc): SVGDescElement | Null = js.native
    @JSName("querySelector")
    def querySelector_details(selectors: details): HTMLDetailsElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dfn(selectors: dfn): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dialog(selectors: dialog): HTMLDialogElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dir(selectors: dir): HTMLDirectoryElement | Null = js.native
    @JSName("querySelector")
    def querySelector_div(selectors: div): HTMLDivElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dl(selectors: dl): HTMLDListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_dt(selectors: dt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ellipse(selectors: ellipse): SVGEllipseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_em(selectors: em): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_embed(selectors: embed): HTMLEmbedElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feBlend(selectors: feBlend): SVGFEBlendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feColorMatrix(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComponentTransfer(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feComposite(selectors: feComposite): SVGFECompositeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feConvolveMatrix(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDiffuseLighting(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDisplacementMap(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feDistantLight(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFlood(selectors: feFlood): SVGFEFloodElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncA(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncB(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncG(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feFuncR(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feGaussianBlur(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feImage(selectors: feImage): SVGFEImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMerge(selectors: feMerge): SVGFEMergeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMergeNode(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feMorphology(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feOffset(selectors: feOffset): SVGFEOffsetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fePointLight(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpecularLighting(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feSpotLight(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTile(selectors: feTile): SVGFETileElement | Null = js.native
    @JSName("querySelector")
    def querySelector_feTurbulence(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_fieldset(selectors: fieldset): HTMLFieldSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figcaption(selectors: figcaption): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_figure(selectors: figure): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_filter(selectors: filter): SVGFilterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_font(selectors: font): HTMLFontElement | Null = js.native
    @JSName("querySelector")
    def querySelector_footer(selectors: footer): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_foreignObject(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_form(selectors: form): HTMLFormElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frame(selectors: frame): HTMLFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_frameset(selectors: frameset): HTMLFrameSetElement | Null = js.native
    @JSName("querySelector")
    def querySelector_g(selectors: g): SVGGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h1(selectors: h1): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h2(selectors: h2): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h3(selectors: h3): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h4(selectors: h4): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h5(selectors: h5): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_h6(selectors: h6): HTMLHeadingElement | Null = js.native
    @JSName("querySelector")
    def querySelector_head(selectors: head): HTMLHeadElement | Null = js.native
    @JSName("querySelector")
    def querySelector_header(selectors: header): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hgroup(selectors: hgroup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_hr(selectors: hr): HTMLHRElement | Null = js.native
    @JSName("querySelector")
    def querySelector_html(selectors: html): HTMLHtmlElement | Null = js.native
    @JSName("querySelector")
    def querySelector_i(selectors: i): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_iframe(selectors: iframe): HTMLIFrameElement | Null = js.native
    @JSName("querySelector")
    def querySelector_image(selectors: image): SVGImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_img(selectors: img): HTMLImageElement | Null = js.native
    @JSName("querySelector")
    def querySelector_input(selectors: input): HTMLInputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ins(selectors: ins): HTMLModElement | Null = js.native
    @JSName("querySelector")
    def querySelector_kbd(selectors: kbd): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_label(selectors: label): HTMLLabelElement | Null = js.native
    @JSName("querySelector")
    def querySelector_legend(selectors: legend): HTMLLegendElement | Null = js.native
    @JSName("querySelector")
    def querySelector_li(selectors: li): HTMLLIElement | Null = js.native
    @JSName("querySelector")
    def querySelector_line(selectors: line): SVGLineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_linearGradient(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_link(selectors: link): HTMLLinkElement | Null = js.native
    @JSName("querySelector")
    def querySelector_main(selectors: main): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_map(selectors: map): HTMLMapElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mark(selectors: mark): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marker(selectors: marker): SVGMarkerElement | Null = js.native
    @JSName("querySelector")
    def querySelector_marquee(selectors: marquee): HTMLMarqueeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_mask(selectors: mask): SVGMaskElement | Null = js.native
    @JSName("querySelector")
    def querySelector_menu(selectors: menu): HTMLMenuElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meta(selectors: meta): HTMLMetaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_metadata(selectors: metadata): SVGMetadataElement | Null = js.native
    @JSName("querySelector")
    def querySelector_meter(selectors: meter): HTMLMeterElement | Null = js.native
    @JSName("querySelector")
    def querySelector_nav(selectors: nav): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_noscript(selectors: noscript): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_object(selectors: `object`): HTMLObjectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ol(selectors: ol): HTMLOListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_optgroup(selectors: optgroup): HTMLOptGroupElement | Null = js.native
    @JSName("querySelector")
    def querySelector_option(selectors: option): HTMLOptionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_output(selectors: output): HTMLOutputElement | Null = js.native
    @JSName("querySelector")
    def querySelector_p(selectors: p): HTMLParagraphElement | Null = js.native
    @JSName("querySelector")
    def querySelector_param(selectors: param): HTMLParamElement | Null = js.native
    @JSName("querySelector")
    def querySelector_path(selectors: path): SVGPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pattern(selectors: pattern): SVGPatternElement | Null = js.native
    @JSName("querySelector")
    def querySelector_picture(selectors: picture): HTMLPictureElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polygon(selectors: polygon): SVGPolygonElement | Null = js.native
    @JSName("querySelector")
    def querySelector_polyline(selectors: polyline): SVGPolylineElement | Null = js.native
    @JSName("querySelector")
    def querySelector_pre(selectors: pre): HTMLPreElement | Null = js.native
    @JSName("querySelector")
    def querySelector_progress(selectors: progress): HTMLProgressElement | Null = js.native
    @JSName("querySelector")
    def querySelector_q(selectors: q): HTMLQuoteElement | Null = js.native
    @JSName("querySelector")
    def querySelector_radialGradient(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rect(selectors: rect): SVGRectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rp(selectors: rp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_rt(selectors: rt): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ruby(selectors: ruby): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_s(selectors: s): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_samp(selectors: samp): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_script(selectors: script): HTMLScriptElement | Null = js.native
    @JSName("querySelector")
    def querySelector_section(selectors: section): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_select(selectors: select): HTMLSelectElement | Null = js.native
    @JSName("querySelector")
    def querySelector_slot(selectors: slot): HTMLSlotElement | Null = js.native
    @JSName("querySelector")
    def querySelector_small(selectors: small): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_source(selectors: source): HTMLSourceElement | Null = js.native
    @JSName("querySelector")
    def querySelector_span(selectors: span): HTMLSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_stop(selectors: stop): SVGStopElement | Null = js.native
    @JSName("querySelector")
    def querySelector_strong(selectors: strong): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_style(selectors: style): HTMLStyleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sub(selectors: sub): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_summary(selectors: summary): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_sup(selectors: sup): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_svg(selectors: svg): SVGSVGElement | Null = js.native
    @JSName("querySelector")
    def querySelector_switch(selectors: switch): SVGSwitchElement | Null = js.native
    @JSName("querySelector")
    def querySelector_symbol(selectors: symbol): SVGSymbolElement | Null = js.native
    @JSName("querySelector")
    def querySelector_table(selectors: table): HTMLTableElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tbody(selectors: tbody): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_td(selectors: td): HTMLTableDataCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_template(selectors: template): HTMLTemplateElement | Null = js.native
    @JSName("querySelector")
    def querySelector_text(selectors: text): SVGTextElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textPath(selectors: textPath): SVGTextPathElement | Null = js.native
    @JSName("querySelector")
    def querySelector_textarea(selectors: textarea): HTMLTextAreaElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tfoot(selectors: tfoot): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_th(selectors: th): HTMLTableHeaderCellElement | Null = js.native
    @JSName("querySelector")
    def querySelector_thead(selectors: thead): HTMLTableSectionElement | Null = js.native
    @JSName("querySelector")
    def querySelector_time(selectors: time): HTMLTimeElement | Null = js.native
    @JSName("querySelector")
    def querySelector_title(selectors: title): HTMLTitleElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tr(selectors: tr): HTMLTableRowElement | Null = js.native
    @JSName("querySelector")
    def querySelector_track(selectors: track): HTMLTrackElement | Null = js.native
    @JSName("querySelector")
    def querySelector_tspan(selectors: tspan): SVGTSpanElement | Null = js.native
    @JSName("querySelector")
    def querySelector_u(selectors: u): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_ul(selectors: ul): HTMLUListElement | Null = js.native
    @JSName("querySelector")
    def querySelector_use(selectors: use): SVGUseElement | Null = js.native
    @JSName("querySelector")
    def querySelector_var(selectors: `var`): HTMLElement | Null = js.native
    @JSName("querySelector")
    def querySelector_video(selectors: video): HTMLVideoElement | Null = js.native
    @JSName("querySelector")
    def querySelector_view(selectors: view): SVGViewElement | Null = js.native
    @JSName("querySelector")
    def querySelector_wbr(selectors: wbr): HTMLElement | Null = js.native
  }
  
  @js.native
  class StylableDOMUtil protected () extends js.Object {
    def this(stylesheet: RuntimeStylesheet) = this()
    def this(stylesheet: RuntimeStylesheet, root: Element) = this()
    
    def getBaseStateWithParam(stateName: String): String = js.native
    
    def getStateValueFromClassName(cls: String, baseState: String): String = js.native
    
    def getStyleState(element: PartialElement, stateName: String): String | Boolean | Null = js.native
    
    def hasStyleState(element: PartialElement, stateName: String): Boolean = js.native
    def hasStyleState(element: PartialElement, stateName: String, param: StateValue): Boolean = js.native
    
    var root: js.Any = js.native
    
    def scopeSelector(): String = js.native
    def scopeSelector(selector: String): String = js.native
    
    def select(): Element | Null = js.native
    def select(selector: js.UndefOr[scala.Nothing], element: PartialElement): Element | Null = js.native
    def select(selector: String): Element | Null = js.native
    def select(selector: String, element: PartialElement): Element | Null = js.native
    
    def selectAll(): js.Array[Element] | Null = js.native
    def selectAll(selector: js.UndefOr[scala.Nothing], element: PartialElement): js.Array[Element] | Null = js.native
    def selectAll(selector: String): js.Array[Element] | Null = js.native
    def selectAll(selector: String, element: PartialElement): js.Array[Element] | Null = js.native
    
    var stylesheet: js.Any = js.native
  }
}
