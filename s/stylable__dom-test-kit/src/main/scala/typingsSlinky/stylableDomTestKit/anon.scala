package typingsSlinky.stylableDomTestKit

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(selectors: `object`): HTMLObjectElement | Null = js.native
    def apply(selectors: `var`): HTMLElement | Null = js.native
    def apply(selectors: a): HTMLAnchorElement | Null = js.native
    def apply(selectors: abbr): HTMLElement | Null = js.native
    def apply(selectors: address): HTMLElement | Null = js.native
    def apply(selectors: applet): HTMLAppletElement | Null = js.native
    def apply(selectors: area): HTMLAreaElement | Null = js.native
    def apply(selectors: article): HTMLElement | Null = js.native
    def apply(selectors: aside): HTMLElement | Null = js.native
    def apply(selectors: audio): HTMLAudioElement | Null = js.native
    def apply(selectors: b): HTMLElement | Null = js.native
    def apply(selectors: base): HTMLBaseElement | Null = js.native
    def apply(selectors: basefont): HTMLBaseFontElement | Null = js.native
    def apply(selectors: bdi): HTMLElement | Null = js.native
    def apply(selectors: bdo): HTMLElement | Null = js.native
    def apply(selectors: blockquote): HTMLQuoteElement | Null = js.native
    def apply(selectors: body): HTMLBodyElement | Null = js.native
    def apply(selectors: br): HTMLBRElement | Null = js.native
    def apply(selectors: button): HTMLButtonElement | Null = js.native
    def apply(selectors: canvas): HTMLCanvasElement | Null = js.native
    def apply(selectors: caption): HTMLTableCaptionElement | Null = js.native
    def apply(selectors: circle): SVGCircleElement | Null = js.native
    def apply(selectors: cite): HTMLElement | Null = js.native
    def apply(selectors: clipPath): SVGClipPathElement | Null = js.native
    def apply(selectors: code): HTMLElement | Null = js.native
    def apply(selectors: col): HTMLTableColElement | Null = js.native
    def apply(selectors: colgroup): HTMLTableColElement | Null = js.native
    def apply(selectors: data): HTMLDataElement | Null = js.native
    def apply(selectors: datalist): HTMLDataListElement | Null = js.native
    def apply(selectors: dd): HTMLElement | Null = js.native
    def apply(selectors: defs): SVGDefsElement | Null = js.native
    def apply(selectors: del): HTMLModElement | Null = js.native
    def apply(selectors: desc): SVGDescElement | Null = js.native
    def apply(selectors: details): HTMLDetailsElement | Null = js.native
    def apply(selectors: dfn): HTMLElement | Null = js.native
    def apply(selectors: dialog): HTMLDialogElement | Null = js.native
    def apply(selectors: dir): HTMLDirectoryElement | Null = js.native
    def apply(selectors: div): HTMLDivElement | Null = js.native
    def apply(selectors: dl): HTMLDListElement | Null = js.native
    def apply(selectors: dt): HTMLElement | Null = js.native
    def apply(selectors: ellipse): SVGEllipseElement | Null = js.native
    def apply(selectors: em): HTMLElement | Null = js.native
    def apply(selectors: embed): HTMLEmbedElement | Null = js.native
    def apply(selectors: feBlend): SVGFEBlendElement | Null = js.native
    def apply(selectors: feColorMatrix): SVGFEColorMatrixElement | Null = js.native
    def apply(selectors: feComponentTransfer): SVGFEComponentTransferElement | Null = js.native
    def apply(selectors: feComposite): SVGFECompositeElement | Null = js.native
    def apply(selectors: feConvolveMatrix): SVGFEConvolveMatrixElement | Null = js.native
    def apply(selectors: feDiffuseLighting): SVGFEDiffuseLightingElement | Null = js.native
    def apply(selectors: feDisplacementMap): SVGFEDisplacementMapElement | Null = js.native
    def apply(selectors: feDistantLight): SVGFEDistantLightElement | Null = js.native
    def apply(selectors: feFlood): SVGFEFloodElement | Null = js.native
    def apply(selectors: feFuncA): SVGFEFuncAElement | Null = js.native
    def apply(selectors: feFuncB): SVGFEFuncBElement | Null = js.native
    def apply(selectors: feFuncG): SVGFEFuncGElement | Null = js.native
    def apply(selectors: feFuncR): SVGFEFuncRElement | Null = js.native
    def apply(selectors: feGaussianBlur): SVGFEGaussianBlurElement | Null = js.native
    def apply(selectors: feImage): SVGFEImageElement | Null = js.native
    def apply(selectors: feMerge): SVGFEMergeElement | Null = js.native
    def apply(selectors: feMergeNode): SVGFEMergeNodeElement | Null = js.native
    def apply(selectors: feMorphology): SVGFEMorphologyElement | Null = js.native
    def apply(selectors: feOffset): SVGFEOffsetElement | Null = js.native
    def apply(selectors: fePointLight): SVGFEPointLightElement | Null = js.native
    def apply(selectors: feSpecularLighting): SVGFESpecularLightingElement | Null = js.native
    def apply(selectors: feSpotLight): SVGFESpotLightElement | Null = js.native
    def apply(selectors: feTile): SVGFETileElement | Null = js.native
    def apply(selectors: feTurbulence): SVGFETurbulenceElement | Null = js.native
    def apply(selectors: fieldset): HTMLFieldSetElement | Null = js.native
    def apply(selectors: figcaption): HTMLElement | Null = js.native
    def apply(selectors: figure): HTMLElement | Null = js.native
    def apply(selectors: filter): SVGFilterElement | Null = js.native
    def apply(selectors: font): HTMLFontElement | Null = js.native
    def apply(selectors: footer): HTMLElement | Null = js.native
    def apply(selectors: foreignObject): SVGForeignObjectElement | Null = js.native
    def apply(selectors: form): HTMLFormElement | Null = js.native
    def apply(selectors: frame): HTMLFrameElement | Null = js.native
    def apply(selectors: frameset): HTMLFrameSetElement | Null = js.native
    def apply(selectors: g): SVGGElement | Null = js.native
    def apply(selectors: h1): HTMLHeadingElement | Null = js.native
    def apply(selectors: h2): HTMLHeadingElement | Null = js.native
    def apply(selectors: h3): HTMLHeadingElement | Null = js.native
    def apply(selectors: h4): HTMLHeadingElement | Null = js.native
    def apply(selectors: h5): HTMLHeadingElement | Null = js.native
    def apply(selectors: h6): HTMLHeadingElement | Null = js.native
    def apply(selectors: head): HTMLHeadElement | Null = js.native
    def apply(selectors: header): HTMLElement | Null = js.native
    def apply(selectors: hgroup): HTMLElement | Null = js.native
    def apply(selectors: hr): HTMLHRElement | Null = js.native
    def apply(selectors: html): HTMLHtmlElement | Null = js.native
    def apply(selectors: i): HTMLElement | Null = js.native
    def apply(selectors: iframe): HTMLIFrameElement | Null = js.native
    def apply(selectors: image): SVGImageElement | Null = js.native
    def apply(selectors: img): HTMLImageElement | Null = js.native
    def apply(selectors: input): HTMLInputElement | Null = js.native
    def apply(selectors: ins): HTMLModElement | Null = js.native
    def apply(selectors: kbd): HTMLElement | Null = js.native
    def apply(selectors: label): HTMLLabelElement | Null = js.native
    def apply(selectors: legend): HTMLLegendElement | Null = js.native
    def apply(selectors: li): HTMLLIElement | Null = js.native
    def apply(selectors: line): SVGLineElement | Null = js.native
    def apply(selectors: linearGradient): SVGLinearGradientElement | Null = js.native
    def apply(selectors: link): HTMLLinkElement | Null = js.native
    def apply(selectors: main): HTMLElement | Null = js.native
    def apply(selectors: map): HTMLMapElement | Null = js.native
    def apply(selectors: mark): HTMLElement | Null = js.native
    def apply(selectors: marker): SVGMarkerElement | Null = js.native
    def apply(selectors: marquee): HTMLMarqueeElement | Null = js.native
    def apply(selectors: mask): SVGMaskElement | Null = js.native
    def apply(selectors: menu): HTMLMenuElement | Null = js.native
    def apply(selectors: meta): HTMLMetaElement | Null = js.native
    def apply(selectors: metadata): SVGMetadataElement | Null = js.native
    def apply(selectors: meter): HTMLMeterElement | Null = js.native
    def apply(selectors: nav): HTMLElement | Null = js.native
    def apply(selectors: noscript): HTMLElement | Null = js.native
    def apply(selectors: ol): HTMLOListElement | Null = js.native
    def apply(selectors: optgroup): HTMLOptGroupElement | Null = js.native
    def apply(selectors: option): HTMLOptionElement | Null = js.native
    def apply(selectors: output): HTMLOutputElement | Null = js.native
    def apply(selectors: p): HTMLParagraphElement | Null = js.native
    def apply(selectors: param): HTMLParamElement | Null = js.native
    def apply(selectors: path): SVGPathElement | Null = js.native
    def apply(selectors: pattern): SVGPatternElement | Null = js.native
    def apply(selectors: picture): HTMLPictureElement | Null = js.native
    def apply(selectors: polygon): SVGPolygonElement | Null = js.native
    def apply(selectors: polyline): SVGPolylineElement | Null = js.native
    def apply(selectors: pre): HTMLPreElement | Null = js.native
    def apply(selectors: progress): HTMLProgressElement | Null = js.native
    def apply(selectors: q): HTMLQuoteElement | Null = js.native
    def apply(selectors: radialGradient): SVGRadialGradientElement | Null = js.native
    def apply(selectors: rect): SVGRectElement | Null = js.native
    def apply(selectors: rp): HTMLElement | Null = js.native
    def apply(selectors: rt): HTMLElement | Null = js.native
    def apply(selectors: ruby): HTMLElement | Null = js.native
    def apply(selectors: s): HTMLElement | Null = js.native
    def apply(selectors: samp): HTMLElement | Null = js.native
    def apply(selectors: script): HTMLScriptElement | Null = js.native
    def apply(selectors: section): HTMLElement | Null = js.native
    def apply(selectors: select): HTMLSelectElement | Null = js.native
    def apply(selectors: slot): HTMLSlotElement | Null = js.native
    def apply(selectors: small): HTMLElement | Null = js.native
    def apply(selectors: source): HTMLSourceElement | Null = js.native
    def apply(selectors: span): HTMLSpanElement | Null = js.native
    def apply(selectors: stop): SVGStopElement | Null = js.native
    def apply(selectors: strong): HTMLElement | Null = js.native
    def apply(selectors: style): HTMLStyleElement | Null = js.native
    def apply(selectors: sub): HTMLElement | Null = js.native
    def apply(selectors: summary): HTMLElement | Null = js.native
    def apply(selectors: sup): HTMLElement | Null = js.native
    def apply(selectors: svg): SVGSVGElement | Null = js.native
    def apply(selectors: switch): SVGSwitchElement | Null = js.native
    def apply(selectors: symbol): SVGSymbolElement | Null = js.native
    def apply(selectors: table): HTMLTableElement | Null = js.native
    def apply(selectors: tbody): HTMLTableSectionElement | Null = js.native
    def apply(selectors: td): HTMLTableDataCellElement | Null = js.native
    def apply(selectors: template): HTMLTemplateElement | Null = js.native
    def apply(selectors: text): SVGTextElement | Null = js.native
    def apply(selectors: textPath): SVGTextPathElement | Null = js.native
    def apply(selectors: textarea): HTMLTextAreaElement | Null = js.native
    def apply(selectors: tfoot): HTMLTableSectionElement | Null = js.native
    def apply(selectors: th): HTMLTableHeaderCellElement | Null = js.native
    def apply(selectors: thead): HTMLTableSectionElement | Null = js.native
    def apply(selectors: time): HTMLTimeElement | Null = js.native
    def apply(selectors: title): HTMLTitleElement | Null = js.native
    def apply(selectors: tr): HTMLTableRowElement | Null = js.native
    def apply(selectors: track): HTMLTrackElement | Null = js.native
    def apply(selectors: tspan): SVGTSpanElement | Null = js.native
    def apply(selectors: u): HTMLElement | Null = js.native
    def apply(selectors: ul): HTMLUListElement | Null = js.native
    def apply(selectors: use): SVGUseElement | Null = js.native
    def apply(selectors: video): HTMLVideoElement | Null = js.native
    def apply(selectors: view): SVGViewElement | Null = js.native
    def apply(selectors: wbr): HTMLElement | Null = js.native
    def apply[E /* <: Element */](selectors: String): E | Null = js.native
  }
  
  @js.native
  trait FnCallSelectors extends StObject {
    
    def apply(selectors: `object`): NodeListOf[HTMLObjectElement with Node] = js.native
    def apply(selectors: `var`): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: a): NodeListOf[HTMLAnchorElement with Node] = js.native
    def apply(selectors: abbr): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: address): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: applet): NodeListOf[HTMLAppletElement with Node] = js.native
    def apply(selectors: area): NodeListOf[HTMLAreaElement with Node] = js.native
    def apply(selectors: article): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: aside): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: audio): NodeListOf[HTMLAudioElement with Node] = js.native
    def apply(selectors: b): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: base): NodeListOf[HTMLBaseElement with Node] = js.native
    def apply(selectors: basefont): NodeListOf[HTMLBaseFontElement with Node] = js.native
    def apply(selectors: bdi): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: bdo): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: blockquote): NodeListOf[HTMLQuoteElement with Node] = js.native
    def apply(selectors: body): NodeListOf[HTMLBodyElement with Node] = js.native
    def apply(selectors: br): NodeListOf[HTMLBRElement with Node] = js.native
    def apply(selectors: button): NodeListOf[HTMLButtonElement with Node] = js.native
    def apply(selectors: canvas): NodeListOf[HTMLCanvasElement with Node] = js.native
    def apply(selectors: caption): NodeListOf[HTMLTableCaptionElement with Node] = js.native
    def apply(selectors: circle): NodeListOf[SVGCircleElement with Node] = js.native
    def apply(selectors: cite): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: clipPath): NodeListOf[SVGClipPathElement with Node] = js.native
    def apply(selectors: code): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: col): NodeListOf[HTMLTableColElement with Node] = js.native
    def apply(selectors: colgroup): NodeListOf[HTMLTableColElement with Node] = js.native
    def apply(selectors: data): NodeListOf[HTMLDataElement with Node] = js.native
    def apply(selectors: datalist): NodeListOf[HTMLDataListElement with Node] = js.native
    def apply(selectors: dd): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: defs): NodeListOf[SVGDefsElement with Node] = js.native
    def apply(selectors: del): NodeListOf[HTMLModElement with Node] = js.native
    def apply(selectors: desc): NodeListOf[SVGDescElement with Node] = js.native
    def apply(selectors: details): NodeListOf[HTMLDetailsElement with Node] = js.native
    def apply(selectors: dfn): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: dialog): NodeListOf[HTMLDialogElement with Node] = js.native
    def apply(selectors: dir): NodeListOf[HTMLDirectoryElement with Node] = js.native
    def apply(selectors: div): NodeListOf[HTMLDivElement with Node] = js.native
    def apply(selectors: dl): NodeListOf[HTMLDListElement with Node] = js.native
    def apply(selectors: dt): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: ellipse): NodeListOf[SVGEllipseElement with Node] = js.native
    def apply(selectors: em): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: embed): NodeListOf[HTMLEmbedElement with Node] = js.native
    def apply(selectors: feBlend): NodeListOf[SVGFEBlendElement with Node] = js.native
    def apply(selectors: feColorMatrix): NodeListOf[SVGFEColorMatrixElement with Node] = js.native
    def apply(selectors: feComponentTransfer): NodeListOf[SVGFEComponentTransferElement with Node] = js.native
    def apply(selectors: feComposite): NodeListOf[SVGFECompositeElement with Node] = js.native
    def apply(selectors: feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement with Node] = js.native
    def apply(selectors: feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement with Node] = js.native
    def apply(selectors: feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement with Node] = js.native
    def apply(selectors: feDistantLight): NodeListOf[SVGFEDistantLightElement with Node] = js.native
    def apply(selectors: feFlood): NodeListOf[SVGFEFloodElement with Node] = js.native
    def apply(selectors: feFuncA): NodeListOf[SVGFEFuncAElement with Node] = js.native
    def apply(selectors: feFuncB): NodeListOf[SVGFEFuncBElement with Node] = js.native
    def apply(selectors: feFuncG): NodeListOf[SVGFEFuncGElement with Node] = js.native
    def apply(selectors: feFuncR): NodeListOf[SVGFEFuncRElement with Node] = js.native
    def apply(selectors: feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement with Node] = js.native
    def apply(selectors: feImage): NodeListOf[SVGFEImageElement with Node] = js.native
    def apply(selectors: feMerge): NodeListOf[SVGFEMergeElement with Node] = js.native
    def apply(selectors: feMergeNode): NodeListOf[SVGFEMergeNodeElement with Node] = js.native
    def apply(selectors: feMorphology): NodeListOf[SVGFEMorphologyElement with Node] = js.native
    def apply(selectors: feOffset): NodeListOf[SVGFEOffsetElement with Node] = js.native
    def apply(selectors: fePointLight): NodeListOf[SVGFEPointLightElement with Node] = js.native
    def apply(selectors: feSpecularLighting): NodeListOf[SVGFESpecularLightingElement with Node] = js.native
    def apply(selectors: feSpotLight): NodeListOf[SVGFESpotLightElement with Node] = js.native
    def apply(selectors: feTile): NodeListOf[SVGFETileElement with Node] = js.native
    def apply(selectors: feTurbulence): NodeListOf[SVGFETurbulenceElement with Node] = js.native
    def apply(selectors: fieldset): NodeListOf[HTMLFieldSetElement with Node] = js.native
    def apply(selectors: figcaption): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: figure): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: filter): NodeListOf[SVGFilterElement with Node] = js.native
    def apply(selectors: font): NodeListOf[HTMLFontElement with Node] = js.native
    def apply(selectors: footer): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: foreignObject): NodeListOf[SVGForeignObjectElement with Node] = js.native
    def apply(selectors: form): NodeListOf[HTMLFormElement with Node] = js.native
    def apply(selectors: frame): NodeListOf[HTMLFrameElement with Node] = js.native
    def apply(selectors: frameset): NodeListOf[HTMLFrameSetElement with Node] = js.native
    def apply(selectors: g): NodeListOf[SVGGElement with Node] = js.native
    def apply(selectors: h1): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: h2): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: h3): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: h4): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: h5): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: h6): NodeListOf[HTMLHeadingElement with Node] = js.native
    def apply(selectors: head): NodeListOf[HTMLHeadElement with Node] = js.native
    def apply(selectors: header): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: hgroup): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: hr): NodeListOf[HTMLHRElement with Node] = js.native
    def apply(selectors: html): NodeListOf[HTMLHtmlElement with Node] = js.native
    def apply(selectors: i): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: iframe): NodeListOf[HTMLIFrameElement with Node] = js.native
    def apply(selectors: image): NodeListOf[SVGImageElement with Node] = js.native
    def apply(selectors: img): NodeListOf[HTMLImageElement with Node] = js.native
    def apply(selectors: input): NodeListOf[HTMLInputElement with Node] = js.native
    def apply(selectors: ins): NodeListOf[HTMLModElement with Node] = js.native
    def apply(selectors: kbd): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: label): NodeListOf[HTMLLabelElement with Node] = js.native
    def apply(selectors: legend): NodeListOf[HTMLLegendElement with Node] = js.native
    def apply(selectors: li): NodeListOf[HTMLLIElement with Node] = js.native
    def apply(selectors: line): NodeListOf[SVGLineElement with Node] = js.native
    def apply(selectors: linearGradient): NodeListOf[SVGLinearGradientElement with Node] = js.native
    def apply(selectors: link): NodeListOf[HTMLLinkElement with Node] = js.native
    def apply(selectors: main): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: map): NodeListOf[HTMLMapElement with Node] = js.native
    def apply(selectors: mark): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: marker): NodeListOf[SVGMarkerElement with Node] = js.native
    def apply(selectors: marquee): NodeListOf[HTMLMarqueeElement with Node] = js.native
    def apply(selectors: mask): NodeListOf[SVGMaskElement with Node] = js.native
    def apply(selectors: menu): NodeListOf[HTMLMenuElement with Node] = js.native
    def apply(selectors: meta): NodeListOf[HTMLMetaElement with Node] = js.native
    def apply(selectors: metadata): NodeListOf[SVGMetadataElement with Node] = js.native
    def apply(selectors: meter): NodeListOf[HTMLMeterElement with Node] = js.native
    def apply(selectors: nav): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: noscript): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: ol): NodeListOf[HTMLOListElement with Node] = js.native
    def apply(selectors: optgroup): NodeListOf[HTMLOptGroupElement with Node] = js.native
    def apply(selectors: option): NodeListOf[HTMLOptionElement with Node] = js.native
    def apply(selectors: output): NodeListOf[HTMLOutputElement with Node] = js.native
    def apply(selectors: p): NodeListOf[HTMLParagraphElement with Node] = js.native
    def apply(selectors: param): NodeListOf[HTMLParamElement with Node] = js.native
    def apply(selectors: path): NodeListOf[SVGPathElement with Node] = js.native
    def apply(selectors: pattern): NodeListOf[SVGPatternElement with Node] = js.native
    def apply(selectors: picture): NodeListOf[HTMLPictureElement with Node] = js.native
    def apply(selectors: polygon): NodeListOf[SVGPolygonElement with Node] = js.native
    def apply(selectors: polyline): NodeListOf[SVGPolylineElement with Node] = js.native
    def apply(selectors: pre): NodeListOf[HTMLPreElement with Node] = js.native
    def apply(selectors: progress): NodeListOf[HTMLProgressElement with Node] = js.native
    def apply(selectors: q): NodeListOf[HTMLQuoteElement with Node] = js.native
    def apply(selectors: radialGradient): NodeListOf[SVGRadialGradientElement with Node] = js.native
    def apply(selectors: rect): NodeListOf[SVGRectElement with Node] = js.native
    def apply(selectors: rp): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: rt): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: ruby): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: s): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: samp): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: script): NodeListOf[HTMLScriptElement with Node] = js.native
    def apply(selectors: section): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: select): NodeListOf[HTMLSelectElement with Node] = js.native
    def apply(selectors: slot): NodeListOf[HTMLSlotElement with Node] = js.native
    def apply(selectors: small): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: source): NodeListOf[HTMLSourceElement with Node] = js.native
    def apply(selectors: span): NodeListOf[HTMLSpanElement with Node] = js.native
    def apply(selectors: stop): NodeListOf[SVGStopElement with Node] = js.native
    def apply(selectors: strong): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: style): NodeListOf[HTMLStyleElement with Node] = js.native
    def apply(selectors: sub): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: summary): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: sup): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: svg): NodeListOf[SVGSVGElement with Node] = js.native
    def apply(selectors: switch): NodeListOf[SVGSwitchElement with Node] = js.native
    def apply(selectors: symbol): NodeListOf[SVGSymbolElement with Node] = js.native
    def apply(selectors: table): NodeListOf[HTMLTableElement with Node] = js.native
    def apply(selectors: tbody): NodeListOf[HTMLTableSectionElement with Node] = js.native
    def apply(selectors: td): NodeListOf[HTMLTableDataCellElement with Node] = js.native
    def apply(selectors: template): NodeListOf[HTMLTemplateElement with Node] = js.native
    def apply(selectors: text): NodeListOf[SVGTextElement with Node] = js.native
    def apply(selectors: textPath): NodeListOf[SVGTextPathElement with Node] = js.native
    def apply(selectors: textarea): NodeListOf[HTMLTextAreaElement with Node] = js.native
    def apply(selectors: tfoot): NodeListOf[HTMLTableSectionElement with Node] = js.native
    def apply(selectors: th): NodeListOf[HTMLTableHeaderCellElement with Node] = js.native
    def apply(selectors: thead): NodeListOf[HTMLTableSectionElement with Node] = js.native
    def apply(selectors: time): NodeListOf[HTMLTimeElement with Node] = js.native
    def apply(selectors: title): NodeListOf[HTMLTitleElement with Node] = js.native
    def apply(selectors: tr): NodeListOf[HTMLTableRowElement with Node] = js.native
    def apply(selectors: track): NodeListOf[HTMLTrackElement with Node] = js.native
    def apply(selectors: tspan): NodeListOf[SVGTSpanElement with Node] = js.native
    def apply(selectors: u): NodeListOf[HTMLElement with Node] = js.native
    def apply(selectors: ul): NodeListOf[HTMLUListElement with Node] = js.native
    def apply(selectors: use): NodeListOf[SVGUseElement with Node] = js.native
    def apply(selectors: video): NodeListOf[HTMLVideoElement with Node] = js.native
    def apply(selectors: view): NodeListOf[SVGViewElement with Node] = js.native
    def apply(selectors: wbr): NodeListOf[HTMLElement with Node] = js.native
    def apply[E /* <: Element */](selectors: String): NodeListOf[E with Node] = js.native
  }
}
