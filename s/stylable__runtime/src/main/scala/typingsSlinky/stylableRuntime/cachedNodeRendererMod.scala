package typingsSlinky.stylableRuntime

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
import typingsSlinky.std.ElementCreationOptions
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
import typingsSlinky.stylableRuntime.anon.FnCall
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.`object`
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.`var`
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.a
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.abbr
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.address
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.applet
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.area
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.article
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.aside
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.audio
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.b
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.base
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.basefont
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.bdi
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.bdo
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.blockquote
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.body
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.br
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.button
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.canvas
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.caption
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.cite
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.code
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.col
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.colgroup
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.data
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.datalist
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dd
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.del
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.details
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dfn
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dialog
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dir
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.div
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dl
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.dt
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.em
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.embed
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.fieldset
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.figcaption
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.figure
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.font
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.footer
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.form
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.frame
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.frameset
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h1
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h2
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h3
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h4
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h5
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.h6
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.head
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.header
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.hgroup
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.hr
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.html
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.i
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.iframe
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.img
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.input
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.ins
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.kbd
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.label
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.legend
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.li
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.link
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.listing
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.main
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.map
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.mark
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.marquee
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.menu
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.meta
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.meter
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.nav
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.noscript
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.ol
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.optgroup
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.option
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.output
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.p
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.param
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.picture
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.pre
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.progress
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.q
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.rp
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.rt
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.ruby
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.s
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.samp
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.script
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.section
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.select
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.slot
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.small
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.source
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.span
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.strong
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.style
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.sub
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.summary
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.sup
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.table
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.tbody
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.td
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.template
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.textarea
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.tfoot
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.th
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.thead
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.time
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.title
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.tr
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.track
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.u
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.ul
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.video
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.wbr
import typingsSlinky.stylableRuntime.stylableRuntimeStrings.xmp
import typingsSlinky.stylableRuntime.typesMod.NodeRenderer
import typingsSlinky.stylableRuntime.typesMod.RenderableStylesheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cachedNodeRendererMod {
  
  @JSImport("@stylable/runtime/cjs/cached-node-renderer", "CacheStyleNodeRenderer")
  @js.native
  class CacheStyleNodeRenderer protected () extends NodeRenderer[RenderableStylesheet, HTMLStyleElement] {
    def this(options: CachedNodeRendererOptions) = this()
    
    var options: js.Any = js.native
  }
  
  @js.native
  trait CachedNodeRendererOptions extends StObject {
    
    var attrKey: String = js.native
    
    def createElement(tagName: String): HTMLElement = js.native
    def createElement(tagName: String, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    var createElement_Original: FnCall = js.native
    @JSName("createElement")
    def createElement_a(tagName: a): HTMLAnchorElement = js.native
    @JSName("createElement")
    def createElement_a(tagName: a, options: ElementCreationOptions): HTMLAnchorElement = js.native
    @JSName("createElement")
    def createElement_abbr(tagName: abbr): HTMLElement = js.native
    @JSName("createElement")
    def createElement_abbr(tagName: abbr, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_address(tagName: address): HTMLElement = js.native
    @JSName("createElement")
    def createElement_address(tagName: address, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_applet(tagName: applet): HTMLAppletElement = js.native
    @JSName("createElement")
    def createElement_applet(tagName: applet, options: ElementCreationOptions): HTMLAppletElement = js.native
    @JSName("createElement")
    def createElement_area(tagName: area): HTMLAreaElement = js.native
    @JSName("createElement")
    def createElement_area(tagName: area, options: ElementCreationOptions): HTMLAreaElement = js.native
    @JSName("createElement")
    def createElement_article(tagName: article): HTMLElement = js.native
    @JSName("createElement")
    def createElement_article(tagName: article, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_aside(tagName: aside): HTMLElement = js.native
    @JSName("createElement")
    def createElement_aside(tagName: aside, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_audio(tagName: audio): HTMLAudioElement = js.native
    @JSName("createElement")
    def createElement_audio(tagName: audio, options: ElementCreationOptions): HTMLAudioElement = js.native
    @JSName("createElement")
    def createElement_b(tagName: b): HTMLElement = js.native
    @JSName("createElement")
    def createElement_b(tagName: b, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_base(tagName: base): HTMLBaseElement = js.native
    @JSName("createElement")
    def createElement_base(tagName: base, options: ElementCreationOptions): HTMLBaseElement = js.native
    @JSName("createElement")
    def createElement_basefont(tagName: basefont): HTMLBaseFontElement = js.native
    @JSName("createElement")
    def createElement_basefont(tagName: basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
    @JSName("createElement")
    def createElement_bdi(tagName: bdi): HTMLElement = js.native
    @JSName("createElement")
    def createElement_bdi(tagName: bdi, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_bdo(tagName: bdo): HTMLElement = js.native
    @JSName("createElement")
    def createElement_bdo(tagName: bdo, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_blockquote(tagName: blockquote): HTMLQuoteElement = js.native
    @JSName("createElement")
    def createElement_blockquote(tagName: blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
    @JSName("createElement")
    def createElement_body(tagName: body): HTMLBodyElement = js.native
    @JSName("createElement")
    def createElement_body(tagName: body, options: ElementCreationOptions): HTMLBodyElement = js.native
    @JSName("createElement")
    def createElement_br(tagName: br): HTMLBRElement = js.native
    @JSName("createElement")
    def createElement_br(tagName: br, options: ElementCreationOptions): HTMLBRElement = js.native
    @JSName("createElement")
    def createElement_button(tagName: button): HTMLButtonElement = js.native
    @JSName("createElement")
    def createElement_button(tagName: button, options: ElementCreationOptions): HTMLButtonElement = js.native
    @JSName("createElement")
    def createElement_canvas(tagName: canvas): HTMLCanvasElement = js.native
    @JSName("createElement")
    def createElement_canvas(tagName: canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
    @JSName("createElement")
    def createElement_caption(tagName: caption): HTMLTableCaptionElement = js.native
    @JSName("createElement")
    def createElement_caption(tagName: caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
    @JSName("createElement")
    def createElement_cite(tagName: cite): HTMLElement = js.native
    @JSName("createElement")
    def createElement_cite(tagName: cite, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_code(tagName: code): HTMLElement = js.native
    @JSName("createElement")
    def createElement_code(tagName: code, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_col(tagName: col): HTMLTableColElement = js.native
    @JSName("createElement")
    def createElement_col(tagName: col, options: ElementCreationOptions): HTMLTableColElement = js.native
    @JSName("createElement")
    def createElement_colgroup(tagName: colgroup): HTMLTableColElement = js.native
    @JSName("createElement")
    def createElement_colgroup(tagName: colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
    @JSName("createElement")
    def createElement_data(tagName: data): HTMLDataElement = js.native
    @JSName("createElement")
    def createElement_data(tagName: data, options: ElementCreationOptions): HTMLDataElement = js.native
    @JSName("createElement")
    def createElement_datalist(tagName: datalist): HTMLDataListElement = js.native
    @JSName("createElement")
    def createElement_datalist(tagName: datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
    @JSName("createElement")
    def createElement_dd(tagName: dd): HTMLElement = js.native
    @JSName("createElement")
    def createElement_dd(tagName: dd, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_del(tagName: del): HTMLModElement = js.native
    @JSName("createElement")
    def createElement_del(tagName: del, options: ElementCreationOptions): HTMLModElement = js.native
    @JSName("createElement")
    def createElement_details(tagName: details): HTMLDetailsElement = js.native
    @JSName("createElement")
    def createElement_details(tagName: details, options: ElementCreationOptions): HTMLDetailsElement = js.native
    @JSName("createElement")
    def createElement_dfn(tagName: dfn): HTMLElement = js.native
    @JSName("createElement")
    def createElement_dfn(tagName: dfn, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_dialog(tagName: dialog): HTMLDialogElement = js.native
    @JSName("createElement")
    def createElement_dialog(tagName: dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
    @JSName("createElement")
    def createElement_dir(tagName: dir): HTMLDirectoryElement = js.native
    @JSName("createElement")
    def createElement_dir(tagName: dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
    @JSName("createElement")
    def createElement_div(tagName: div): HTMLDivElement = js.native
    @JSName("createElement")
    def createElement_div(tagName: div, options: ElementCreationOptions): HTMLDivElement = js.native
    @JSName("createElement")
    def createElement_dl(tagName: dl): HTMLDListElement = js.native
    @JSName("createElement")
    def createElement_dl(tagName: dl, options: ElementCreationOptions): HTMLDListElement = js.native
    @JSName("createElement")
    def createElement_dt(tagName: dt): HTMLElement = js.native
    @JSName("createElement")
    def createElement_dt(tagName: dt, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_em(tagName: em): HTMLElement = js.native
    @JSName("createElement")
    def createElement_em(tagName: em, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_embed(tagName: embed): HTMLEmbedElement = js.native
    @JSName("createElement")
    def createElement_embed(tagName: embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
    @JSName("createElement")
    def createElement_fieldset(tagName: fieldset): HTMLFieldSetElement = js.native
    @JSName("createElement")
    def createElement_fieldset(tagName: fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
    @JSName("createElement")
    def createElement_figcaption(tagName: figcaption): HTMLElement = js.native
    @JSName("createElement")
    def createElement_figcaption(tagName: figcaption, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_figure(tagName: figure): HTMLElement = js.native
    @JSName("createElement")
    def createElement_figure(tagName: figure, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_font(tagName: font): HTMLFontElement = js.native
    @JSName("createElement")
    def createElement_font(tagName: font, options: ElementCreationOptions): HTMLFontElement = js.native
    @JSName("createElement")
    def createElement_footer(tagName: footer): HTMLElement = js.native
    @JSName("createElement")
    def createElement_footer(tagName: footer, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_form(tagName: form): HTMLFormElement = js.native
    @JSName("createElement")
    def createElement_form(tagName: form, options: ElementCreationOptions): HTMLFormElement = js.native
    @JSName("createElement")
    def createElement_frame(tagName: frame): HTMLFrameElement = js.native
    @JSName("createElement")
    def createElement_frame(tagName: frame, options: ElementCreationOptions): HTMLFrameElement = js.native
    @JSName("createElement")
    def createElement_frameset(tagName: frameset): HTMLFrameSetElement = js.native
    @JSName("createElement")
    def createElement_frameset(tagName: frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
    @JSName("createElement")
    def createElement_h1(tagName: h1): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h1(tagName: h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h2(tagName: h2): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h2(tagName: h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h3(tagName: h3): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h3(tagName: h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h4(tagName: h4): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h4(tagName: h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h5(tagName: h5): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h5(tagName: h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h6(tagName: h6): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_h6(tagName: h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
    @JSName("createElement")
    def createElement_head(tagName: head): HTMLHeadElement = js.native
    @JSName("createElement")
    def createElement_head(tagName: head, options: ElementCreationOptions): HTMLHeadElement = js.native
    @JSName("createElement")
    def createElement_header(tagName: header): HTMLElement = js.native
    @JSName("createElement")
    def createElement_header(tagName: header, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_hgroup(tagName: hgroup): HTMLElement = js.native
    @JSName("createElement")
    def createElement_hgroup(tagName: hgroup, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_hr(tagName: hr): HTMLHRElement = js.native
    @JSName("createElement")
    def createElement_hr(tagName: hr, options: ElementCreationOptions): HTMLHRElement = js.native
    @JSName("createElement")
    def createElement_html(tagName: html): HTMLHtmlElement = js.native
    @JSName("createElement")
    def createElement_html(tagName: html, options: ElementCreationOptions): HTMLHtmlElement = js.native
    @JSName("createElement")
    def createElement_i(tagName: i): HTMLElement = js.native
    @JSName("createElement")
    def createElement_i(tagName: i, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_iframe(tagName: iframe): HTMLIFrameElement = js.native
    @JSName("createElement")
    def createElement_iframe(tagName: iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
    @JSName("createElement")
    def createElement_img(tagName: img): HTMLImageElement = js.native
    @JSName("createElement")
    def createElement_img(tagName: img, options: ElementCreationOptions): HTMLImageElement = js.native
    @JSName("createElement")
    def createElement_input(tagName: input): HTMLInputElement = js.native
    @JSName("createElement")
    def createElement_input(tagName: input, options: ElementCreationOptions): HTMLInputElement = js.native
    @JSName("createElement")
    def createElement_ins(tagName: ins): HTMLModElement = js.native
    @JSName("createElement")
    def createElement_ins(tagName: ins, options: ElementCreationOptions): HTMLModElement = js.native
    @JSName("createElement")
    def createElement_kbd(tagName: kbd): HTMLElement = js.native
    @JSName("createElement")
    def createElement_kbd(tagName: kbd, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_label(tagName: label): HTMLLabelElement = js.native
    @JSName("createElement")
    def createElement_label(tagName: label, options: ElementCreationOptions): HTMLLabelElement = js.native
    @JSName("createElement")
    def createElement_legend(tagName: legend): HTMLLegendElement = js.native
    @JSName("createElement")
    def createElement_legend(tagName: legend, options: ElementCreationOptions): HTMLLegendElement = js.native
    @JSName("createElement")
    def createElement_li(tagName: li): HTMLLIElement = js.native
    @JSName("createElement")
    def createElement_li(tagName: li, options: ElementCreationOptions): HTMLLIElement = js.native
    @JSName("createElement")
    def createElement_link(tagName: link): HTMLLinkElement = js.native
    @JSName("createElement")
    def createElement_link(tagName: link, options: ElementCreationOptions): HTMLLinkElement = js.native
    @JSName("createElement")
    def createElement_listing(tagName: listing): HTMLPreElement = js.native
    @JSName("createElement")
    def createElement_listing(tagName: listing, options: ElementCreationOptions): HTMLPreElement = js.native
    @JSName("createElement")
    def createElement_main(tagName: main): HTMLElement = js.native
    @JSName("createElement")
    def createElement_main(tagName: main, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_map(tagName: map): HTMLMapElement = js.native
    @JSName("createElement")
    def createElement_map(tagName: map, options: ElementCreationOptions): HTMLMapElement = js.native
    @JSName("createElement")
    def createElement_mark(tagName: mark): HTMLElement = js.native
    @JSName("createElement")
    def createElement_mark(tagName: mark, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_marquee(tagName: marquee): HTMLMarqueeElement = js.native
    @JSName("createElement")
    def createElement_marquee(tagName: marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
    @JSName("createElement")
    def createElement_menu(tagName: menu): HTMLMenuElement = js.native
    @JSName("createElement")
    def createElement_menu(tagName: menu, options: ElementCreationOptions): HTMLMenuElement = js.native
    @JSName("createElement")
    def createElement_meta(tagName: meta): HTMLMetaElement = js.native
    @JSName("createElement")
    def createElement_meta(tagName: meta, options: ElementCreationOptions): HTMLMetaElement = js.native
    @JSName("createElement")
    def createElement_meter(tagName: meter): HTMLMeterElement = js.native
    @JSName("createElement")
    def createElement_meter(tagName: meter, options: ElementCreationOptions): HTMLMeterElement = js.native
    @JSName("createElement")
    def createElement_nav(tagName: nav): HTMLElement = js.native
    @JSName("createElement")
    def createElement_nav(tagName: nav, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_noscript(tagName: noscript): HTMLElement = js.native
    @JSName("createElement")
    def createElement_noscript(tagName: noscript, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_object(tagName: `object`): HTMLObjectElement = js.native
    @JSName("createElement")
    def createElement_object(tagName: `object`, options: ElementCreationOptions): HTMLObjectElement = js.native
    @JSName("createElement")
    def createElement_ol(tagName: ol): HTMLOListElement = js.native
    @JSName("createElement")
    def createElement_ol(tagName: ol, options: ElementCreationOptions): HTMLOListElement = js.native
    @JSName("createElement")
    def createElement_optgroup(tagName: optgroup): HTMLOptGroupElement = js.native
    @JSName("createElement")
    def createElement_optgroup(tagName: optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
    @JSName("createElement")
    def createElement_option(tagName: option): HTMLOptionElement = js.native
    @JSName("createElement")
    def createElement_option(tagName: option, options: ElementCreationOptions): HTMLOptionElement = js.native
    @JSName("createElement")
    def createElement_output(tagName: output): HTMLOutputElement = js.native
    @JSName("createElement")
    def createElement_output(tagName: output, options: ElementCreationOptions): HTMLOutputElement = js.native
    @JSName("createElement")
    def createElement_p(tagName: p): HTMLParagraphElement = js.native
    @JSName("createElement")
    def createElement_p(tagName: p, options: ElementCreationOptions): HTMLParagraphElement = js.native
    @JSName("createElement")
    def createElement_param(tagName: param): HTMLParamElement = js.native
    @JSName("createElement")
    def createElement_param(tagName: param, options: ElementCreationOptions): HTMLParamElement = js.native
    @JSName("createElement")
    def createElement_picture(tagName: picture): HTMLPictureElement = js.native
    @JSName("createElement")
    def createElement_picture(tagName: picture, options: ElementCreationOptions): HTMLPictureElement = js.native
    @JSName("createElement")
    def createElement_pre(tagName: pre): HTMLPreElement = js.native
    @JSName("createElement")
    def createElement_pre(tagName: pre, options: ElementCreationOptions): HTMLPreElement = js.native
    @JSName("createElement")
    def createElement_progress(tagName: progress): HTMLProgressElement = js.native
    @JSName("createElement")
    def createElement_progress(tagName: progress, options: ElementCreationOptions): HTMLProgressElement = js.native
    @JSName("createElement")
    def createElement_q(tagName: q): HTMLQuoteElement = js.native
    @JSName("createElement")
    def createElement_q(tagName: q, options: ElementCreationOptions): HTMLQuoteElement = js.native
    @JSName("createElement")
    def createElement_rp(tagName: rp): HTMLElement = js.native
    @JSName("createElement")
    def createElement_rp(tagName: rp, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_rt(tagName: rt): HTMLElement = js.native
    @JSName("createElement")
    def createElement_rt(tagName: rt, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_ruby(tagName: ruby): HTMLElement = js.native
    @JSName("createElement")
    def createElement_ruby(tagName: ruby, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_s(tagName: s): HTMLElement = js.native
    @JSName("createElement")
    def createElement_s(tagName: s, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_samp(tagName: samp): HTMLElement = js.native
    @JSName("createElement")
    def createElement_samp(tagName: samp, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_script(tagName: script): HTMLScriptElement = js.native
    @JSName("createElement")
    def createElement_script(tagName: script, options: ElementCreationOptions): HTMLScriptElement = js.native
    @JSName("createElement")
    def createElement_section(tagName: section): HTMLElement = js.native
    @JSName("createElement")
    def createElement_section(tagName: section, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_select(tagName: select): HTMLSelectElement = js.native
    @JSName("createElement")
    def createElement_select(tagName: select, options: ElementCreationOptions): HTMLSelectElement = js.native
    @JSName("createElement")
    def createElement_slot(tagName: slot): HTMLSlotElement = js.native
    @JSName("createElement")
    def createElement_slot(tagName: slot, options: ElementCreationOptions): HTMLSlotElement = js.native
    @JSName("createElement")
    def createElement_small(tagName: small): HTMLElement = js.native
    @JSName("createElement")
    def createElement_small(tagName: small, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_source(tagName: source): HTMLSourceElement = js.native
    @JSName("createElement")
    def createElement_source(tagName: source, options: ElementCreationOptions): HTMLSourceElement = js.native
    @JSName("createElement")
    def createElement_span(tagName: span): HTMLSpanElement = js.native
    @JSName("createElement")
    def createElement_span(tagName: span, options: ElementCreationOptions): HTMLSpanElement = js.native
    @JSName("createElement")
    def createElement_strong(tagName: strong): HTMLElement = js.native
    @JSName("createElement")
    def createElement_strong(tagName: strong, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_style(tagName: style): HTMLStyleElement = js.native
    @JSName("createElement")
    def createElement_style(tagName: style, options: ElementCreationOptions): HTMLStyleElement = js.native
    @JSName("createElement")
    def createElement_sub(tagName: sub): HTMLElement = js.native
    @JSName("createElement")
    def createElement_sub(tagName: sub, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_summary(tagName: summary): HTMLElement = js.native
    @JSName("createElement")
    def createElement_summary(tagName: summary, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_sup(tagName: sup): HTMLElement = js.native
    @JSName("createElement")
    def createElement_sup(tagName: sup, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_table(tagName: table): HTMLTableElement = js.native
    @JSName("createElement")
    def createElement_table(tagName: table, options: ElementCreationOptions): HTMLTableElement = js.native
    @JSName("createElement")
    def createElement_tbody(tagName: tbody): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_tbody(tagName: tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_td(tagName: td): HTMLTableDataCellElement = js.native
    @JSName("createElement")
    def createElement_td(tagName: td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
    @JSName("createElement")
    def createElement_template(tagName: template): HTMLTemplateElement = js.native
    @JSName("createElement")
    def createElement_template(tagName: template, options: ElementCreationOptions): HTMLTemplateElement = js.native
    @JSName("createElement")
    def createElement_textarea(tagName: textarea): HTMLTextAreaElement = js.native
    @JSName("createElement")
    def createElement_textarea(tagName: textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
    @JSName("createElement")
    def createElement_tfoot(tagName: tfoot): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_tfoot(tagName: tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_th(tagName: th): HTMLTableHeaderCellElement = js.native
    @JSName("createElement")
    def createElement_th(tagName: th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
    @JSName("createElement")
    def createElement_thead(tagName: thead): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_thead(tagName: thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    @JSName("createElement")
    def createElement_time(tagName: time): HTMLTimeElement = js.native
    @JSName("createElement")
    def createElement_time(tagName: time, options: ElementCreationOptions): HTMLTimeElement = js.native
    @JSName("createElement")
    def createElement_title(tagName: title): HTMLTitleElement = js.native
    @JSName("createElement")
    def createElement_title(tagName: title, options: ElementCreationOptions): HTMLTitleElement = js.native
    @JSName("createElement")
    def createElement_tr(tagName: tr): HTMLTableRowElement = js.native
    @JSName("createElement")
    def createElement_tr(tagName: tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
    @JSName("createElement")
    def createElement_track(tagName: track): HTMLTrackElement = js.native
    @JSName("createElement")
    def createElement_track(tagName: track, options: ElementCreationOptions): HTMLTrackElement = js.native
    @JSName("createElement")
    def createElement_u(tagName: u): HTMLElement = js.native
    @JSName("createElement")
    def createElement_u(tagName: u, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_ul(tagName: ul): HTMLUListElement = js.native
    @JSName("createElement")
    def createElement_ul(tagName: ul, options: ElementCreationOptions): HTMLUListElement = js.native
    @JSName("createElement")
    def createElement_var(tagName: `var`): HTMLElement = js.native
    @JSName("createElement")
    def createElement_var(tagName: `var`, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_video(tagName: video): HTMLVideoElement = js.native
    @JSName("createElement")
    def createElement_video(tagName: video, options: ElementCreationOptions): HTMLVideoElement = js.native
    @JSName("createElement")
    def createElement_wbr(tagName: wbr): HTMLElement = js.native
    @JSName("createElement")
    def createElement_wbr(tagName: wbr, options: ElementCreationOptions): HTMLElement = js.native
    @JSName("createElement")
    def createElement_xmp(tagName: xmp): HTMLPreElement = js.native
    @JSName("createElement")
    def createElement_xmp(tagName: xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  }
}
