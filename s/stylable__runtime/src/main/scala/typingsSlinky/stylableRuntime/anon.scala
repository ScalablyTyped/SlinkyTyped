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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Css extends StObject {
    
    @JSName("$css")
    var $css: String = js.native
    
    @JSName("$depth")
    var $depth: String | Double = js.native
    
    @JSName("$id")
    var $id: String | Double = js.native
    
    @JSName("$theme")
    var $theme: Boolean = js.native
  }
  object Css {
    
    @scala.inline
    def apply($css: String, $depth: String | Double, $id: String | Double, $theme: Boolean): Css = {
      val __obj = js.Dynamic.literal($css = $css.asInstanceOf[js.Any], $depth = $depth.asInstanceOf[js.Any], $id = $id.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$css(value: String): Self = StObject.set(x, "$css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$depth(value: String | Double): Self = StObject.set(x, "$depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$id(value: String | Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$theme(value: Boolean): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(tagName: String): HTMLElement = js.native
    def apply(tagName: String, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: `object`): HTMLObjectElement = js.native
    def apply(tagName: `object`, options: ElementCreationOptions): HTMLObjectElement = js.native
    def apply(tagName: `var`): HTMLElement = js.native
    def apply(tagName: `var`, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: a): HTMLAnchorElement = js.native
    def apply(tagName: abbr): HTMLElement = js.native
    def apply(tagName: abbr, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: address): HTMLElement = js.native
    def apply(tagName: address, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: a, options: ElementCreationOptions): HTMLAnchorElement = js.native
    def apply(tagName: applet): HTMLAppletElement = js.native
    def apply(tagName: applet, options: ElementCreationOptions): HTMLAppletElement = js.native
    def apply(tagName: area): HTMLAreaElement = js.native
    def apply(tagName: area, options: ElementCreationOptions): HTMLAreaElement = js.native
    def apply(tagName: article): HTMLElement = js.native
    def apply(tagName: article, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: aside): HTMLElement = js.native
    def apply(tagName: aside, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: audio): HTMLAudioElement = js.native
    def apply(tagName: audio, options: ElementCreationOptions): HTMLAudioElement = js.native
    def apply(tagName: b): HTMLElement = js.native
    def apply(tagName: base): HTMLBaseElement = js.native
    def apply(tagName: basefont): HTMLBaseFontElement = js.native
    def apply(tagName: basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
    def apply(tagName: base, options: ElementCreationOptions): HTMLBaseElement = js.native
    def apply(tagName: bdi): HTMLElement = js.native
    def apply(tagName: bdi, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: bdo): HTMLElement = js.native
    def apply(tagName: bdo, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: blockquote): HTMLQuoteElement = js.native
    def apply(tagName: blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
    def apply(tagName: body): HTMLBodyElement = js.native
    def apply(tagName: body, options: ElementCreationOptions): HTMLBodyElement = js.native
    def apply(tagName: b, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: br): HTMLBRElement = js.native
    def apply(tagName: br, options: ElementCreationOptions): HTMLBRElement = js.native
    def apply(tagName: button): HTMLButtonElement = js.native
    def apply(tagName: button, options: ElementCreationOptions): HTMLButtonElement = js.native
    def apply(tagName: canvas): HTMLCanvasElement = js.native
    def apply(tagName: canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
    def apply(tagName: caption): HTMLTableCaptionElement = js.native
    def apply(tagName: caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
    def apply(tagName: cite): HTMLElement = js.native
    def apply(tagName: cite, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: code): HTMLElement = js.native
    def apply(tagName: code, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: col): HTMLTableColElement = js.native
    def apply(tagName: colgroup): HTMLTableColElement = js.native
    def apply(tagName: colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
    def apply(tagName: col, options: ElementCreationOptions): HTMLTableColElement = js.native
    def apply(tagName: data): HTMLDataElement = js.native
    def apply(tagName: datalist): HTMLDataListElement = js.native
    def apply(tagName: datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
    def apply(tagName: data, options: ElementCreationOptions): HTMLDataElement = js.native
    def apply(tagName: dd): HTMLElement = js.native
    def apply(tagName: dd, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: del): HTMLModElement = js.native
    def apply(tagName: del, options: ElementCreationOptions): HTMLModElement = js.native
    def apply(tagName: details): HTMLDetailsElement = js.native
    def apply(tagName: details, options: ElementCreationOptions): HTMLDetailsElement = js.native
    def apply(tagName: dfn): HTMLElement = js.native
    def apply(tagName: dfn, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: dialog): HTMLDialogElement = js.native
    def apply(tagName: dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
    def apply(tagName: dir): HTMLDirectoryElement = js.native
    def apply(tagName: dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
    def apply(tagName: div): HTMLDivElement = js.native
    def apply(tagName: div, options: ElementCreationOptions): HTMLDivElement = js.native
    def apply(tagName: dl): HTMLDListElement = js.native
    def apply(tagName: dl, options: ElementCreationOptions): HTMLDListElement = js.native
    def apply(tagName: dt): HTMLElement = js.native
    def apply(tagName: dt, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: em): HTMLElement = js.native
    def apply(tagName: embed): HTMLEmbedElement = js.native
    def apply(tagName: embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
    def apply(tagName: em, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: fieldset): HTMLFieldSetElement = js.native
    def apply(tagName: fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
    def apply(tagName: figcaption): HTMLElement = js.native
    def apply(tagName: figcaption, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: figure): HTMLElement = js.native
    def apply(tagName: figure, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: font): HTMLFontElement = js.native
    def apply(tagName: font, options: ElementCreationOptions): HTMLFontElement = js.native
    def apply(tagName: footer): HTMLElement = js.native
    def apply(tagName: footer, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: form): HTMLFormElement = js.native
    def apply(tagName: form, options: ElementCreationOptions): HTMLFormElement = js.native
    def apply(tagName: frame): HTMLFrameElement = js.native
    def apply(tagName: frame, options: ElementCreationOptions): HTMLFrameElement = js.native
    def apply(tagName: frameset): HTMLFrameSetElement = js.native
    def apply(tagName: frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
    def apply(tagName: h1): HTMLHeadingElement = js.native
    def apply(tagName: h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h2): HTMLHeadingElement = js.native
    def apply(tagName: h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h3): HTMLHeadingElement = js.native
    def apply(tagName: h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h4): HTMLHeadingElement = js.native
    def apply(tagName: h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h5): HTMLHeadingElement = js.native
    def apply(tagName: h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: h6): HTMLHeadingElement = js.native
    def apply(tagName: h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
    def apply(tagName: head): HTMLHeadElement = js.native
    def apply(tagName: header): HTMLElement = js.native
    def apply(tagName: header, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: head, options: ElementCreationOptions): HTMLHeadElement = js.native
    def apply(tagName: hgroup): HTMLElement = js.native
    def apply(tagName: hgroup, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: hr): HTMLHRElement = js.native
    def apply(tagName: hr, options: ElementCreationOptions): HTMLHRElement = js.native
    def apply(tagName: html): HTMLHtmlElement = js.native
    def apply(tagName: html, options: ElementCreationOptions): HTMLHtmlElement = js.native
    def apply(tagName: i): HTMLElement = js.native
    def apply(tagName: iframe): HTMLIFrameElement = js.native
    def apply(tagName: iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
    def apply(tagName: img): HTMLImageElement = js.native
    def apply(tagName: img, options: ElementCreationOptions): HTMLImageElement = js.native
    def apply(tagName: input): HTMLInputElement = js.native
    def apply(tagName: input, options: ElementCreationOptions): HTMLInputElement = js.native
    def apply(tagName: ins): HTMLModElement = js.native
    def apply(tagName: ins, options: ElementCreationOptions): HTMLModElement = js.native
    def apply(tagName: i, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: kbd): HTMLElement = js.native
    def apply(tagName: kbd, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: label): HTMLLabelElement = js.native
    def apply(tagName: label, options: ElementCreationOptions): HTMLLabelElement = js.native
    def apply(tagName: legend): HTMLLegendElement = js.native
    def apply(tagName: legend, options: ElementCreationOptions): HTMLLegendElement = js.native
    def apply(tagName: li): HTMLLIElement = js.native
    def apply(tagName: link): HTMLLinkElement = js.native
    def apply(tagName: link, options: ElementCreationOptions): HTMLLinkElement = js.native
    def apply(tagName: li, options: ElementCreationOptions): HTMLLIElement = js.native
    def apply(tagName: listing): HTMLPreElement = js.native
    def apply(tagName: listing, options: ElementCreationOptions): HTMLPreElement = js.native
    def apply(tagName: main): HTMLElement = js.native
    def apply(tagName: main, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: map): HTMLMapElement = js.native
    def apply(tagName: map, options: ElementCreationOptions): HTMLMapElement = js.native
    def apply(tagName: mark): HTMLElement = js.native
    def apply(tagName: mark, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: marquee): HTMLMarqueeElement = js.native
    def apply(tagName: marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
    def apply(tagName: menu): HTMLMenuElement = js.native
    def apply(tagName: menu, options: ElementCreationOptions): HTMLMenuElement = js.native
    def apply(tagName: meta): HTMLMetaElement = js.native
    def apply(tagName: meta, options: ElementCreationOptions): HTMLMetaElement = js.native
    def apply(tagName: meter): HTMLMeterElement = js.native
    def apply(tagName: meter, options: ElementCreationOptions): HTMLMeterElement = js.native
    def apply(tagName: nav): HTMLElement = js.native
    def apply(tagName: nav, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: noscript): HTMLElement = js.native
    def apply(tagName: noscript, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: ol): HTMLOListElement = js.native
    def apply(tagName: ol, options: ElementCreationOptions): HTMLOListElement = js.native
    def apply(tagName: optgroup): HTMLOptGroupElement = js.native
    def apply(tagName: optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
    def apply(tagName: option): HTMLOptionElement = js.native
    def apply(tagName: option, options: ElementCreationOptions): HTMLOptionElement = js.native
    def apply(tagName: output): HTMLOutputElement = js.native
    def apply(tagName: output, options: ElementCreationOptions): HTMLOutputElement = js.native
    def apply(tagName: p): HTMLParagraphElement = js.native
    def apply(tagName: param): HTMLParamElement = js.native
    def apply(tagName: param, options: ElementCreationOptions): HTMLParamElement = js.native
    def apply(tagName: picture): HTMLPictureElement = js.native
    def apply(tagName: picture, options: ElementCreationOptions): HTMLPictureElement = js.native
    def apply(tagName: p, options: ElementCreationOptions): HTMLParagraphElement = js.native
    def apply(tagName: pre): HTMLPreElement = js.native
    def apply(tagName: pre, options: ElementCreationOptions): HTMLPreElement = js.native
    def apply(tagName: progress): HTMLProgressElement = js.native
    def apply(tagName: progress, options: ElementCreationOptions): HTMLProgressElement = js.native
    def apply(tagName: q): HTMLQuoteElement = js.native
    def apply(tagName: q, options: ElementCreationOptions): HTMLQuoteElement = js.native
    def apply(tagName: rp): HTMLElement = js.native
    def apply(tagName: rp, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: rt): HTMLElement = js.native
    def apply(tagName: rt, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: ruby): HTMLElement = js.native
    def apply(tagName: ruby, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: s): HTMLElement = js.native
    def apply(tagName: samp): HTMLElement = js.native
    def apply(tagName: samp, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: script): HTMLScriptElement = js.native
    def apply(tagName: script, options: ElementCreationOptions): HTMLScriptElement = js.native
    def apply(tagName: section): HTMLElement = js.native
    def apply(tagName: section, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: select): HTMLSelectElement = js.native
    def apply(tagName: select, options: ElementCreationOptions): HTMLSelectElement = js.native
    def apply(tagName: slot): HTMLSlotElement = js.native
    def apply(tagName: slot, options: ElementCreationOptions): HTMLSlotElement = js.native
    def apply(tagName: small): HTMLElement = js.native
    def apply(tagName: small, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: s, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: source): HTMLSourceElement = js.native
    def apply(tagName: source, options: ElementCreationOptions): HTMLSourceElement = js.native
    def apply(tagName: span): HTMLSpanElement = js.native
    def apply(tagName: span, options: ElementCreationOptions): HTMLSpanElement = js.native
    def apply(tagName: strong): HTMLElement = js.native
    def apply(tagName: strong, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: style): HTMLStyleElement = js.native
    def apply(tagName: style, options: ElementCreationOptions): HTMLStyleElement = js.native
    def apply(tagName: sub): HTMLElement = js.native
    def apply(tagName: sub, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: summary): HTMLElement = js.native
    def apply(tagName: summary, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: sup): HTMLElement = js.native
    def apply(tagName: sup, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: table): HTMLTableElement = js.native
    def apply(tagName: table, options: ElementCreationOptions): HTMLTableElement = js.native
    def apply(tagName: tbody): HTMLTableSectionElement = js.native
    def apply(tagName: tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: td): HTMLTableDataCellElement = js.native
    def apply(tagName: td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
    def apply(tagName: template): HTMLTemplateElement = js.native
    def apply(tagName: template, options: ElementCreationOptions): HTMLTemplateElement = js.native
    def apply(tagName: textarea): HTMLTextAreaElement = js.native
    def apply(tagName: textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
    def apply(tagName: tfoot): HTMLTableSectionElement = js.native
    def apply(tagName: tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: th): HTMLTableHeaderCellElement = js.native
    def apply(tagName: thead): HTMLTableSectionElement = js.native
    def apply(tagName: thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
    def apply(tagName: th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
    def apply(tagName: time): HTMLTimeElement = js.native
    def apply(tagName: time, options: ElementCreationOptions): HTMLTimeElement = js.native
    def apply(tagName: title): HTMLTitleElement = js.native
    def apply(tagName: title, options: ElementCreationOptions): HTMLTitleElement = js.native
    def apply(tagName: tr): HTMLTableRowElement = js.native
    def apply(tagName: track): HTMLTrackElement = js.native
    def apply(tagName: track, options: ElementCreationOptions): HTMLTrackElement = js.native
    def apply(tagName: tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
    def apply(tagName: u): HTMLElement = js.native
    def apply(tagName: ul): HTMLUListElement = js.native
    def apply(tagName: ul, options: ElementCreationOptions): HTMLUListElement = js.native
    def apply(tagName: u, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: video): HTMLVideoElement = js.native
    def apply(tagName: video, options: ElementCreationOptions): HTMLVideoElement = js.native
    def apply(tagName: wbr): HTMLElement = js.native
    def apply(tagName: wbr, options: ElementCreationOptions): HTMLElement = js.native
    def apply(tagName: xmp): HTMLPreElement = js.native
    def apply(tagName: xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  }
}
