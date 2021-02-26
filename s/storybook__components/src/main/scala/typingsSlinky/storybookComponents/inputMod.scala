package typingsSlinky.storybookComponents

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
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
import org.scalajs.dom.raw.HTMLTableColElement
import org.scalajs.dom.raw.HTMLTableElement
import org.scalajs.dom.raw.HTMLTableRowElement
import org.scalajs.dom.raw.HTMLTableSectionElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import org.scalajs.dom.raw.HTMLTitleElement
import org.scalajs.dom.raw.HTMLTrackElement
import org.scalajs.dom.raw.HTMLUListElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGClipPathElement
import org.scalajs.dom.raw.SVGDefsElement
import org.scalajs.dom.raw.SVGDescElement
import org.scalajs.dom.raw.SVGElement
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
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.emotionStyledBase.helperMod.PropsOf
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.AreaHTMLAttributes
import typingsSlinky.react.mod.AudioHTMLAttributes
import typingsSlinky.react.mod.BaseHTMLAttributes
import typingsSlinky.react.mod.BlockquoteHTMLAttributes
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.CanvasHTMLAttributes
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ChangeEventHandler
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.ColHTMLAttributes
import typingsSlinky.react.mod.ColgroupHTMLAttributes
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DataHTMLAttributes
import typingsSlinky.react.mod.DelHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.DetailsHTMLAttributes
import typingsSlinky.react.mod.DialogHTMLAttributes
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.EmbedHTMLAttributes
import typingsSlinky.react.mod.FieldsetHTMLAttributes
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.FormHTMLAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.HtmlHTMLAttributes
import typingsSlinky.react.mod.IframeHTMLAttributes
import typingsSlinky.react.mod.ImgHTMLAttributes
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.InsHTMLAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.KeygenHTMLAttributes
import typingsSlinky.react.mod.LabelHTMLAttributes
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.LiHTMLAttributes
import typingsSlinky.react.mod.LinkHTMLAttributes
import typingsSlinky.react.mod.MapHTMLAttributes
import typingsSlinky.react.mod.MenuHTMLAttributes
import typingsSlinky.react.mod.MetaHTMLAttributes
import typingsSlinky.react.mod.MeterHTMLAttributes
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ObjectHTMLAttributes
import typingsSlinky.react.mod.OlHTMLAttributes
import typingsSlinky.react.mod.OptgroupHTMLAttributes
import typingsSlinky.react.mod.OptionHTMLAttributes
import typingsSlinky.react.mod.OutputHTMLAttributes
import typingsSlinky.react.mod.ParamHTMLAttributes
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ProgressHTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.QuoteHTMLAttributes
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.react.mod.ScriptHTMLAttributes
import typingsSlinky.react.mod.SelectHTMLAttributes
import typingsSlinky.react.mod.SlotHTMLAttributes
import typingsSlinky.react.mod.SourceHTMLAttributes
import typingsSlinky.react.mod.StyleHTMLAttributes
import typingsSlinky.react.mod.TableHTMLAttributes
import typingsSlinky.react.mod.TdHTMLAttributes
import typingsSlinky.react.mod.TextareaHTMLAttributes
import typingsSlinky.react.mod.ThHTMLAttributes
import typingsSlinky.react.mod.TimeHTMLAttributes
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TrackHTMLAttributes
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.VideoHTMLAttributes
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.react.mod.WebViewHTMLAttributes
import typingsSlinky.react.mod.WheelEventHandler
import typingsSlinky.std.HTMLDataElement
import typingsSlinky.std.HTMLDialogElement
import typingsSlinky.std.HTMLSlotElement
import typingsSlinky.std.HTMLTableDataCellElement
import typingsSlinky.std.HTMLTableHeaderCellElement
import typingsSlinky.std.HTMLTemplateElement
import typingsSlinky.std.Partial
import typingsSlinky.std.SVGFEDropShadowElement
import typingsSlinky.std.SVGForeignObjectElement
import typingsSlinky.storybookComponents.anon.PartialPickInputPropscolo
import typingsSlinky.storybookComponents.anon.PartialPickSelectHTMLAttr
import typingsSlinky.storybookComponents.anon.PickanycolortranslatehiddAbout
import typingsSlinky.storybookComponents.anon.PropsWithChildrenPickInpu
import typingsSlinky.storybookComponents.anon.PropsWithChildrenPickSeleAbout
import typingsSlinky.storybookComponents.anon.WeakValidationMapPickInpu
import typingsSlinky.storybookComponents.anon.WeakValidationMapPickSele
import typingsSlinky.storybookComponents.storybookComponentsStrings.`additions removals`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`additions text`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`inline`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`object`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`removals additions`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`removals text`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`text additions`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`text removals`
import typingsSlinky.storybookComponents.storybookComponentsStrings.`var`
import typingsSlinky.storybookComponents.storybookComponentsStrings.a
import typingsSlinky.storybookComponents.storybookComponentsStrings.abbr
import typingsSlinky.storybookComponents.storybookComponentsStrings.additions
import typingsSlinky.storybookComponents.storybookComponentsStrings.address
import typingsSlinky.storybookComponents.storybookComponentsStrings.align
import typingsSlinky.storybookComponents.storybookComponentsStrings.all
import typingsSlinky.storybookComponents.storybookComponentsStrings.animate
import typingsSlinky.storybookComponents.storybookComponentsStrings.animateMotion
import typingsSlinky.storybookComponents.storybookComponentsStrings.animateTransform
import typingsSlinky.storybookComponents.storybookComponentsStrings.area
import typingsSlinky.storybookComponents.storybookComponentsStrings.article
import typingsSlinky.storybookComponents.storybookComponentsStrings.ascending
import typingsSlinky.storybookComponents.storybookComponentsStrings.aside
import typingsSlinky.storybookComponents.storybookComponentsStrings.assertive
import typingsSlinky.storybookComponents.storybookComponentsStrings.audio
import typingsSlinky.storybookComponents.storybookComponentsStrings.b
import typingsSlinky.storybookComponents.storybookComponentsStrings.base
import typingsSlinky.storybookComponents.storybookComponentsStrings.bdi
import typingsSlinky.storybookComponents.storybookComponentsStrings.bdo
import typingsSlinky.storybookComponents.storybookComponentsStrings.big
import typingsSlinky.storybookComponents.storybookComponentsStrings.blockquote
import typingsSlinky.storybookComponents.storybookComponentsStrings.body
import typingsSlinky.storybookComponents.storybookComponentsStrings.both
import typingsSlinky.storybookComponents.storybookComponentsStrings.br
import typingsSlinky.storybookComponents.storybookComponentsStrings.button
import typingsSlinky.storybookComponents.storybookComponentsStrings.canvas
import typingsSlinky.storybookComponents.storybookComponentsStrings.caption
import typingsSlinky.storybookComponents.storybookComponentsStrings.circle
import typingsSlinky.storybookComponents.storybookComponentsStrings.cite
import typingsSlinky.storybookComponents.storybookComponentsStrings.clipPath
import typingsSlinky.storybookComponents.storybookComponentsStrings.code
import typingsSlinky.storybookComponents.storybookComponentsStrings.col
import typingsSlinky.storybookComponents.storybookComponentsStrings.colgroup
import typingsSlinky.storybookComponents.storybookComponentsStrings.copy
import typingsSlinky.storybookComponents.storybookComponentsStrings.data
import typingsSlinky.storybookComponents.storybookComponentsStrings.datalist
import typingsSlinky.storybookComponents.storybookComponentsStrings.date
import typingsSlinky.storybookComponents.storybookComponentsStrings.dd
import typingsSlinky.storybookComponents.storybookComponentsStrings.decimal
import typingsSlinky.storybookComponents.storybookComponentsStrings.defs
import typingsSlinky.storybookComponents.storybookComponentsStrings.del
import typingsSlinky.storybookComponents.storybookComponentsStrings.desc
import typingsSlinky.storybookComponents.storybookComponentsStrings.descending
import typingsSlinky.storybookComponents.storybookComponentsStrings.details
import typingsSlinky.storybookComponents.storybookComponentsStrings.dfn
import typingsSlinky.storybookComponents.storybookComponentsStrings.dialog
import typingsSlinky.storybookComponents.storybookComponentsStrings.div
import typingsSlinky.storybookComponents.storybookComponentsStrings.dl
import typingsSlinky.storybookComponents.storybookComponentsStrings.dt
import typingsSlinky.storybookComponents.storybookComponentsStrings.ellipse
import typingsSlinky.storybookComponents.storybookComponentsStrings.em
import typingsSlinky.storybookComponents.storybookComponentsStrings.email
import typingsSlinky.storybookComponents.storybookComponentsStrings.embed
import typingsSlinky.storybookComponents.storybookComponentsStrings.execute
import typingsSlinky.storybookComponents.storybookComponentsStrings.feBlend
import typingsSlinky.storybookComponents.storybookComponentsStrings.feColorMatrix
import typingsSlinky.storybookComponents.storybookComponentsStrings.feComponentTransfer
import typingsSlinky.storybookComponents.storybookComponentsStrings.feComposite
import typingsSlinky.storybookComponents.storybookComponentsStrings.feConvolveMatrix
import typingsSlinky.storybookComponents.storybookComponentsStrings.feDiffuseLighting
import typingsSlinky.storybookComponents.storybookComponentsStrings.feDisplacementMap
import typingsSlinky.storybookComponents.storybookComponentsStrings.feDistantLight
import typingsSlinky.storybookComponents.storybookComponentsStrings.feDropShadow
import typingsSlinky.storybookComponents.storybookComponentsStrings.feFlood
import typingsSlinky.storybookComponents.storybookComponentsStrings.feFuncA
import typingsSlinky.storybookComponents.storybookComponentsStrings.feFuncB
import typingsSlinky.storybookComponents.storybookComponentsStrings.feFuncG
import typingsSlinky.storybookComponents.storybookComponentsStrings.feFuncR
import typingsSlinky.storybookComponents.storybookComponentsStrings.feGaussianBlur
import typingsSlinky.storybookComponents.storybookComponentsStrings.feImage
import typingsSlinky.storybookComponents.storybookComponentsStrings.feMerge
import typingsSlinky.storybookComponents.storybookComponentsStrings.feMergeNode
import typingsSlinky.storybookComponents.storybookComponentsStrings.feMorphology
import typingsSlinky.storybookComponents.storybookComponentsStrings.feOffset
import typingsSlinky.storybookComponents.storybookComponentsStrings.fePointLight
import typingsSlinky.storybookComponents.storybookComponentsStrings.feSpecularLighting
import typingsSlinky.storybookComponents.storybookComponentsStrings.feSpotLight
import typingsSlinky.storybookComponents.storybookComponentsStrings.feTile
import typingsSlinky.storybookComponents.storybookComponentsStrings.feTurbulence
import typingsSlinky.storybookComponents.storybookComponentsStrings.fieldset
import typingsSlinky.storybookComponents.storybookComponentsStrings.figcaption
import typingsSlinky.storybookComponents.storybookComponentsStrings.figure
import typingsSlinky.storybookComponents.storybookComponentsStrings.filter
import typingsSlinky.storybookComponents.storybookComponentsStrings.footer
import typingsSlinky.storybookComponents.storybookComponentsStrings.foreignObject
import typingsSlinky.storybookComponents.storybookComponentsStrings.form
import typingsSlinky.storybookComponents.storybookComponentsStrings.g
import typingsSlinky.storybookComponents.storybookComponentsStrings.grammar
import typingsSlinky.storybookComponents.storybookComponentsStrings.grid
import typingsSlinky.storybookComponents.storybookComponentsStrings.h1
import typingsSlinky.storybookComponents.storybookComponentsStrings.h2
import typingsSlinky.storybookComponents.storybookComponentsStrings.h3
import typingsSlinky.storybookComponents.storybookComponentsStrings.h4
import typingsSlinky.storybookComponents.storybookComponentsStrings.h5
import typingsSlinky.storybookComponents.storybookComponentsStrings.h6
import typingsSlinky.storybookComponents.storybookComponentsStrings.head
import typingsSlinky.storybookComponents.storybookComponentsStrings.header
import typingsSlinky.storybookComponents.storybookComponentsStrings.height
import typingsSlinky.storybookComponents.storybookComponentsStrings.hgroup
import typingsSlinky.storybookComponents.storybookComponentsStrings.horizontal
import typingsSlinky.storybookComponents.storybookComponentsStrings.hr
import typingsSlinky.storybookComponents.storybookComponentsStrings.html
import typingsSlinky.storybookComponents.storybookComponentsStrings.i
import typingsSlinky.storybookComponents.storybookComponentsStrings.iframe
import typingsSlinky.storybookComponents.storybookComponentsStrings.image
import typingsSlinky.storybookComponents.storybookComponentsStrings.img
import typingsSlinky.storybookComponents.storybookComponentsStrings.inherit
import typingsSlinky.storybookComponents.storybookComponentsStrings.input
import typingsSlinky.storybookComponents.storybookComponentsStrings.ins
import typingsSlinky.storybookComponents.storybookComponentsStrings.kbd
import typingsSlinky.storybookComponents.storybookComponentsStrings.keygen
import typingsSlinky.storybookComponents.storybookComponentsStrings.label
import typingsSlinky.storybookComponents.storybookComponentsStrings.legend
import typingsSlinky.storybookComponents.storybookComponentsStrings.li
import typingsSlinky.storybookComponents.storybookComponentsStrings.line
import typingsSlinky.storybookComponents.storybookComponentsStrings.linearGradient
import typingsSlinky.storybookComponents.storybookComponentsStrings.link
import typingsSlinky.storybookComponents.storybookComponentsStrings.list
import typingsSlinky.storybookComponents.storybookComponentsStrings.listbox
import typingsSlinky.storybookComponents.storybookComponentsStrings.location
import typingsSlinky.storybookComponents.storybookComponentsStrings.main
import typingsSlinky.storybookComponents.storybookComponentsStrings.map
import typingsSlinky.storybookComponents.storybookComponentsStrings.mark
import typingsSlinky.storybookComponents.storybookComponentsStrings.marker
import typingsSlinky.storybookComponents.storybookComponentsStrings.mask
import typingsSlinky.storybookComponents.storybookComponentsStrings.menu
import typingsSlinky.storybookComponents.storybookComponentsStrings.menuitem
import typingsSlinky.storybookComponents.storybookComponentsStrings.meta
import typingsSlinky.storybookComponents.storybookComponentsStrings.metadata
import typingsSlinky.storybookComponents.storybookComponentsStrings.meter
import typingsSlinky.storybookComponents.storybookComponentsStrings.mixed
import typingsSlinky.storybookComponents.storybookComponentsStrings.move
import typingsSlinky.storybookComponents.storybookComponentsStrings.mpath
import typingsSlinky.storybookComponents.storybookComponentsStrings.nav
import typingsSlinky.storybookComponents.storybookComponentsStrings.no
import typingsSlinky.storybookComponents.storybookComponentsStrings.noindex
import typingsSlinky.storybookComponents.storybookComponentsStrings.none
import typingsSlinky.storybookComponents.storybookComponentsStrings.noscript
import typingsSlinky.storybookComponents.storybookComponentsStrings.numeric
import typingsSlinky.storybookComponents.storybookComponentsStrings.off
import typingsSlinky.storybookComponents.storybookComponentsStrings.ol
import typingsSlinky.storybookComponents.storybookComponentsStrings.on
import typingsSlinky.storybookComponents.storybookComponentsStrings.optgroup
import typingsSlinky.storybookComponents.storybookComponentsStrings.option
import typingsSlinky.storybookComponents.storybookComponentsStrings.other
import typingsSlinky.storybookComponents.storybookComponentsStrings.output
import typingsSlinky.storybookComponents.storybookComponentsStrings.p
import typingsSlinky.storybookComponents.storybookComponentsStrings.page
import typingsSlinky.storybookComponents.storybookComponentsStrings.param
import typingsSlinky.storybookComponents.storybookComponentsStrings.path
import typingsSlinky.storybookComponents.storybookComponentsStrings.pattern
import typingsSlinky.storybookComponents.storybookComponentsStrings.picture
import typingsSlinky.storybookComponents.storybookComponentsStrings.polite
import typingsSlinky.storybookComponents.storybookComponentsStrings.polygon
import typingsSlinky.storybookComponents.storybookComponentsStrings.polyline
import typingsSlinky.storybookComponents.storybookComponentsStrings.popup
import typingsSlinky.storybookComponents.storybookComponentsStrings.pre
import typingsSlinky.storybookComponents.storybookComponentsStrings.progress
import typingsSlinky.storybookComponents.storybookComponentsStrings.q
import typingsSlinky.storybookComponents.storybookComponentsStrings.radialGradient
import typingsSlinky.storybookComponents.storybookComponentsStrings.rect
import typingsSlinky.storybookComponents.storybookComponentsStrings.removals
import typingsSlinky.storybookComponents.storybookComponentsStrings.rp
import typingsSlinky.storybookComponents.storybookComponentsStrings.rt
import typingsSlinky.storybookComponents.storybookComponentsStrings.ruby
import typingsSlinky.storybookComponents.storybookComponentsStrings.s
import typingsSlinky.storybookComponents.storybookComponentsStrings.samp
import typingsSlinky.storybookComponents.storybookComponentsStrings.script
import typingsSlinky.storybookComponents.storybookComponentsStrings.search
import typingsSlinky.storybookComponents.storybookComponentsStrings.section
import typingsSlinky.storybookComponents.storybookComponentsStrings.select
import typingsSlinky.storybookComponents.storybookComponentsStrings.size
import typingsSlinky.storybookComponents.storybookComponentsStrings.slot
import typingsSlinky.storybookComponents.storybookComponentsStrings.small
import typingsSlinky.storybookComponents.storybookComponentsStrings.source
import typingsSlinky.storybookComponents.storybookComponentsStrings.span
import typingsSlinky.storybookComponents.storybookComponentsStrings.spelling
import typingsSlinky.storybookComponents.storybookComponentsStrings.step
import typingsSlinky.storybookComponents.storybookComponentsStrings.stop
import typingsSlinky.storybookComponents.storybookComponentsStrings.strong
import typingsSlinky.storybookComponents.storybookComponentsStrings.style
import typingsSlinky.storybookComponents.storybookComponentsStrings.sub
import typingsSlinky.storybookComponents.storybookComponentsStrings.summary
import typingsSlinky.storybookComponents.storybookComponentsStrings.sup
import typingsSlinky.storybookComponents.storybookComponentsStrings.svg
import typingsSlinky.storybookComponents.storybookComponentsStrings.switch
import typingsSlinky.storybookComponents.storybookComponentsStrings.symbol
import typingsSlinky.storybookComponents.storybookComponentsStrings.table
import typingsSlinky.storybookComponents.storybookComponentsStrings.tbody
import typingsSlinky.storybookComponents.storybookComponentsStrings.td
import typingsSlinky.storybookComponents.storybookComponentsStrings.tel
import typingsSlinky.storybookComponents.storybookComponentsStrings.template
import typingsSlinky.storybookComponents.storybookComponentsStrings.text
import typingsSlinky.storybookComponents.storybookComponentsStrings.textPath
import typingsSlinky.storybookComponents.storybookComponentsStrings.textarea
import typingsSlinky.storybookComponents.storybookComponentsStrings.tfoot
import typingsSlinky.storybookComponents.storybookComponentsStrings.th
import typingsSlinky.storybookComponents.storybookComponentsStrings.thead
import typingsSlinky.storybookComponents.storybookComponentsStrings.theme
import typingsSlinky.storybookComponents.storybookComponentsStrings.time
import typingsSlinky.storybookComponents.storybookComponentsStrings.title
import typingsSlinky.storybookComponents.storybookComponentsStrings.tr
import typingsSlinky.storybookComponents.storybookComponentsStrings.track
import typingsSlinky.storybookComponents.storybookComponentsStrings.tree
import typingsSlinky.storybookComponents.storybookComponentsStrings.tspan
import typingsSlinky.storybookComponents.storybookComponentsStrings.u
import typingsSlinky.storybookComponents.storybookComponentsStrings.ul
import typingsSlinky.storybookComponents.storybookComponentsStrings.url
import typingsSlinky.storybookComponents.storybookComponentsStrings.use
import typingsSlinky.storybookComponents.storybookComponentsStrings.valid
import typingsSlinky.storybookComponents.storybookComponentsStrings.vertical
import typingsSlinky.storybookComponents.storybookComponentsStrings.video
import typingsSlinky.storybookComponents.storybookComponentsStrings.view
import typingsSlinky.storybookComponents.storybookComponentsStrings.wbr
import typingsSlinky.storybookComponents.storybookComponentsStrings.webview
import typingsSlinky.storybookComponents.storybookComponentsStrings.yes
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@storybook/components/dist/form/input/input", "Button")
  @js.native
  val Button: ReactComponentClass[js.Any] = js.native
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick<@storybook/components.@storybook/components/dist/form/input/input.InputProps, 'color' | 'content' | 'height' | 'translate' | 'width' | 'default' | 'hidden' | 'key' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'formAction' | 'formEncType' | 'formMethod' | 'formNoValidate' | 'formTarget' | 'name' | 'type' | 'value' | 'start' | 'cite' | 'data' | 'label' | 'span' | 'summary' | 'pattern' | 'list' | 'step' | 'wrap' | 'href' | 'size' | 'open' | 'multiple' | 'cellPadding' | 'cellSpacing' | 'alt' | 'crossOrigin' | 'sizes' | 'src' | 'srcSet' | 'useMap' | 'reversed' | 'max' | 'media' | 'method' | 'min' | 'target' | 'download' | 'hrefLang' | 'rel' | 'htmlFor' | 'valid' | 'align' | 'accept' | 'acceptCharset' | 'action' | 'allowFullScreen' | 'allowTransparency' | 'as' | 'async' | 'autoComplete' | 'autoPlay' | 'capture' | 'charSet' | 'challenge' | 'checked' | 'classID' | 'cols' | 'colSpan' | 'controls' | 'coords' | 'dateTime' | 'defer' | 'encType' | 'frameBorder' | 'headers' | 'high' | 'httpEquiv' | 'integrity' | 'keyParams' | 'keyType' | 'kind' | 'loop' | 'low' | 'manifest' | 'marginHeight' | 'marginWidth' | 'maxLength' | 'mediaGroup' | 'minLength' | 'muted' | 'nonce' | 'noValidate' | 'optimum' | 'playsInline' | 'poster' | 'preload' | 'readOnly' | 'required' | 'rows' | 'rowSpan' | 'sandbox' | 'scope' | 'scoped' | 'scrolling' | 'seamless' | 'selected' | 'shape' | 'srcDoc' | 'srcLang' | 'wmode'> & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Input {
    
    @JSImport("@storybook/components/dist/form/input/input", "Input")
    @js.native
    def apply(props: PropsWithChildrenPickInpu): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input")
    @js.native
    def apply(props: PropsWithChildrenPickInpu, context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPickInputPropscolo] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialPickInputPropscolo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    @scala.inline
    def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPickInpu] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapPickInpu]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent[Tag /* <: ReactComponentClass[_] */](tag: Tag): StyledComponent[PropsOf[Tag], InputStyleProps, Theme] = js.native
    /**
      * @desc this method is type-unsafe
      */
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_br(tag: br): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_del(tag: del): StyledComponent[
        DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_hr(tag: hr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_menu(tag: menu): StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_meter(tag: meter): StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_time(tag: time): StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        InputStyleProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], InputStyleProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Input.withComponent")
    @js.native
    def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLElement], HTMLElement], 
        InputStyleProps, 
        Theme
      ] = js.native
  }
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'multiple' | 'autoComplete' | 'required'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.SelectProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Select {
    
    @JSImport("@storybook/components/dist/form/input/input", "Select")
    @js.native
    def apply(props: PropsWithChildrenPickSeleAbout): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select")
    @js.native
    def apply(props: PropsWithChildrenPickSeleAbout, context: js.Any): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialPickSelectHTMLAttr] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialPickSelectHTMLAttr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    @scala.inline
    def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapPickSele] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapPickSele]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent[Tag /* <: ReactComponentClass[_] */](tag: Tag): StyledComponent[PropsOf[Tag], SelectProps, Theme] = js.native
    /**
      * @desc this method is type-unsafe
      */
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_br(tag: br): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_del(tag: del): StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_hr(tag: hr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_menu(tag: menu): StyledComponent[DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_meter(tag: meter): StyledComponent[DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_time(tag: time): StyledComponent[DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        SelectProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Select.withComponent")
    @js.native
    def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLElement], HTMLElement], 
        SelectProps, 
        Theme
      ] = js.native
  }
  
  /* Inlined @emotion/styled-base.@emotion/styled-base.StyledComponent<std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosizeProps * / any, 'color' | 'translate' | 'hidden' | 'defaultChecked' | 'defaultValue' | 'suppressContentEditableWarning' | 'suppressHydrationWarning' | 'accessKey' | 'className' | 'contentEditable' | 'contextMenu' | 'dir' | 'draggable' | 'id' | 'lang' | 'placeholder' | 'slot' | 'spellCheck' | 'style' | 'tabIndex' | 'title' | 'radioGroup' | 'role' | 'about' | 'datatype' | 'inlist' | 'prefix' | 'property' | 'resource' | 'typeof' | 'vocab' | 'autoCapitalize' | 'autoCorrect' | 'autoSave' | 'itemProp' | 'itemScope' | 'itemType' | 'itemID' | 'itemRef' | 'results' | 'security' | 'unselectable' | 'inputMode' | 'is' | 'aria-activedescendant' | 'aria-atomic' | 'aria-autocomplete' | 'aria-busy' | 'aria-checked' | 'aria-colcount' | 'aria-colindex' | 'aria-colspan' | 'aria-controls' | 'aria-current' | 'aria-describedby' | 'aria-details' | 'aria-disabled' | 'aria-dropeffect' | 'aria-errormessage' | 'aria-expanded' | 'aria-flowto' | 'aria-grabbed' | 'aria-haspopup' | 'aria-hidden' | 'aria-invalid' | 'aria-keyshortcuts' | 'aria-label' | 'aria-labelledby' | 'aria-level' | 'aria-live' | 'aria-modal' | 'aria-multiline' | 'aria-multiselectable' | 'aria-orientation' | 'aria-owns' | 'aria-placeholder' | 'aria-posinset' | 'aria-pressed' | 'aria-readonly' | 'aria-relevant' | 'aria-required' | 'aria-roledescription' | 'aria-rowcount' | 'aria-rowindex' | 'aria-rowspan' | 'aria-selected' | 'aria-setsize' | 'aria-sort' | 'aria-valuemax' | 'aria-valuemin' | 'aria-valuenow' | 'aria-valuetext' | 'children' | 'dangerouslySetInnerHTML' | 'onCopy' | 'onCopyCapture' | 'onCut' | 'onCutCapture' | 'onPaste' | 'onPasteCapture' | 'onCompositionEnd' | 'onCompositionEndCapture' | 'onCompositionStart' | 'onCompositionStartCapture' | 'onCompositionUpdate' | 'onCompositionUpdateCapture' | 'onFocus' | 'onFocusCapture' | 'onBlur' | 'onBlurCapture' | 'onChange' | 'onChangeCapture' | 'onBeforeInput' | 'onBeforeInputCapture' | 'onInput' | 'onInputCapture' | 'onReset' | 'onResetCapture' | 'onSubmit' | 'onSubmitCapture' | 'onInvalid' | 'onInvalidCapture' | 'onLoad' | 'onLoadCapture' | 'onError' | 'onErrorCapture' | 'onKeyDown' | 'onKeyDownCapture' | 'onKeyPress' | 'onKeyPressCapture' | 'onKeyUp' | 'onKeyUpCapture' | 'onAbort' | 'onAbortCapture' | 'onCanPlay' | 'onCanPlayCapture' | 'onCanPlayThrough' | 'onCanPlayThroughCapture' | 'onDurationChange' | 'onDurationChangeCapture' | 'onEmptied' | 'onEmptiedCapture' | 'onEncrypted' | 'onEncryptedCapture' | 'onEnded' | 'onEndedCapture' | 'onLoadedData' | 'onLoadedDataCapture' | 'onLoadedMetadata' | 'onLoadedMetadataCapture' | 'onLoadStart' | 'onLoadStartCapture' | 'onPause' | 'onPauseCapture' | 'onPlay' | 'onPlayCapture' | 'onPlaying' | 'onPlayingCapture' | 'onProgress' | 'onProgressCapture' | 'onRateChange' | 'onRateChangeCapture' | 'onSeeked' | 'onSeekedCapture' | 'onSeeking' | 'onSeekingCapture' | 'onStalled' | 'onStalledCapture' | 'onSuspend' | 'onSuspendCapture' | 'onTimeUpdate' | 'onTimeUpdateCapture' | 'onVolumeChange' | 'onVolumeChangeCapture' | 'onWaiting' | 'onWaitingCapture' | 'onAuxClick' | 'onAuxClickCapture' | 'onClick' | 'onClickCapture' | 'onContextMenu' | 'onContextMenuCapture' | 'onDoubleClick' | 'onDoubleClickCapture' | 'onDrag' | 'onDragCapture' | 'onDragEnd' | 'onDragEndCapture' | 'onDragEnter' | 'onDragEnterCapture' | 'onDragExit' | 'onDragExitCapture' | 'onDragLeave' | 'onDragLeaveCapture' | 'onDragOver' | 'onDragOverCapture' | 'onDragStart' | 'onDragStartCapture' | 'onDrop' | 'onDropCapture' | 'onMouseDown' | 'onMouseDownCapture' | 'onMouseEnter' | 'onMouseLeave' | 'onMouseMove' | 'onMouseMoveCapture' | 'onMouseOut' | 'onMouseOutCapture' | 'onMouseOver' | 'onMouseOverCapture' | 'onMouseUp' | 'onMouseUpCapture' | 'onSelect' | 'onSelectCapture' | 'onTouchCancel' | 'onTouchCancelCapture' | 'onTouchEnd' | 'onTouchEndCapture' | 'onTouchMove' | 'onTouchMoveCapture' | 'onTouchStart' | 'onTouchStartCapture' | 'onPointerDown' | 'onPointerDownCapture' | 'onPointerMove' | 'onPointerMoveCapture' | 'onPointerUp' | 'onPointerUpCapture' | 'onPointerCancel' | 'onPointerCancelCapture' | 'onPointerEnter' | 'onPointerEnterCapture' | 'onPointerLeave' | 'onPointerLeaveCapture' | 'onPointerOver' | 'onPointerOverCapture' | 'onPointerOut' | 'onPointerOutCapture' | 'onGotPointerCapture' | 'onGotPointerCaptureCapture' | 'onLostPointerCapture' | 'onLostPointerCaptureCapture' | 'onScroll' | 'onScrollCapture' | 'onWheel' | 'onWheelCapture' | 'onAnimationStart' | 'onAnimationStartCapture' | 'onAnimationEnd' | 'onAnimationEndCapture' | 'onAnimationIteration' | 'onAnimationIterationCapture' | 'onTransitionEnd' | 'onTransitionEndCapture' | 'css' | 'autoFocus' | 'disabled' | 'form' | 'name' | 'value' | 'wrap' | 'autoComplete' | 'cols' | 'maxLength' | 'minLength' | 'readOnly' | 'required' | 'rows' | 'dirName' | 'maxRows' | 'minRows' | 'onHeightChange' | 'cacheMeasurements'> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps & react.react.RefAttributes<any>, @storybook/components.@storybook/components/dist/form/input/input.TextareaProps, @storybook/theming.@storybook/theming.Theme> & {  displayName :string} */
  object Textarea {
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea")
    @js.native
    def apply(
      props: PropsWithChildren[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
    ): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea")
    @js.native
    def apply(
      props: PropsWithChildren[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]],
      context: js.Any
    ): ReactElement | Null = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[
        Partial[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
      ] = js.native
    @scala.inline
    def defaultProps_=(
      x: js.UndefOr[
          Partial[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.__emotion_styles")
    @js.native
    def emotionStyles: js.Any = js.native
    
    @scala.inline
    def emotionStyles_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__emotion_styles")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.propTypes")
    @js.native
    def propTypes: js.UndefOr[
        WeakValidationMap[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
      ] = js.native
    @scala.inline
    def propTypes_=(
      x: js.UndefOr[
          WeakValidationMap[PickanycolortranslatehiddAbout with (Omit[TextareaProps, theme]) with `0`[Theme]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent[Tag /* <: ReactComponentClass[_] */](tag: Tag): StyledComponent[PropsOf[Tag], TextareaProps, Theme] = js.native
    /**
      * @desc this method is type-unsafe
      */
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_a(tag: a): StyledComponent[
        DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_area(tag: area): StyledComponent[
        DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_audio(tag: audio): StyledComponent[
        DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_base(tag: base): StyledComponent[
        DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_blockquote(tag: blockquote): StyledComponent[
        DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_body(tag: body): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_br(tag: br): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_button(tag: button): StyledComponent[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_canvas(tag: canvas): StyledComponent[
        DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_col(tag: col): StyledComponent[
        DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_colgroup(tag: colgroup): StyledComponent[
        DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_data(tag: data): StyledComponent[
        DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_datalist(tag: datalist): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_del(tag: del): StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_details(tag: details): StyledComponent[
        DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_dialog(tag: dialog): StyledComponent[
        DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_div(tag: div): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_dl(tag: dl): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_embed(tag: embed): StyledComponent[
        DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_fieldset(tag: fieldset): StyledComponent[
        DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_form(tag: form): StyledComponent[
        DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h1(tag: h1): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h2(tag: h2): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h3(tag: h3): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h4(tag: h4): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h5(tag: h5): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_h6(tag: h6): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_head(tag: head): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_hr(tag: hr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_html(tag: html): StyledComponent[
        DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_iframe(tag: iframe): StyledComponent[
        DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_img(tag: img): StyledComponent[
        DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_input(tag: input): StyledComponent[
        DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_ins(tag: ins): StyledComponent[
        DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_keygen(tag: keygen): StyledComponent[
        DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_label(tag: label): StyledComponent[
        DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_legend(tag: legend): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_li(tag: li): StyledComponent[
        DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_link(tag: link): StyledComponent[
        DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_map(tag: map): StyledComponent[
        DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_menu(tag: menu): StyledComponent[
        DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_meta(tag: meta): StyledComponent[
        DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_meter(tag: meter): StyledComponent[
        DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_object(tag: `object`): StyledComponent[
        DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_ol(tag: ol): StyledComponent[
        DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_optgroup(tag: optgroup): StyledComponent[
        DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_option(tag: option): StyledComponent[
        DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_output(tag: output): StyledComponent[
        DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_p(tag: p): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_param(tag: param): StyledComponent[
        DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_pre(tag: pre): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_progress(tag: progress): StyledComponent[
        DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_q(tag: q): StyledComponent[
        DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_script(tag: script): StyledComponent[
        DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_select(tag: select): StyledComponent[
        DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_slot(tag: slot): StyledComponent[
        DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_source(tag: source): StyledComponent[
        DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_span(tag: span): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_style(tag: style): StyledComponent[
        DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_table(tag: table): StyledComponent[
        DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_tbody(tag: tbody): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_td(tag: td): StyledComponent[
        DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_template(tag: template): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_textarea(tag: textarea): StyledComponent[
        DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_tfoot(tag: tfoot): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_th(tag: th): StyledComponent[
        DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_thead(tag: thead): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_time(tag: time): StyledComponent[
        DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_title(tag: title): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_tr(tag: tr): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_track(tag: track): StyledComponent[
        DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_ul(tag: ul): StyledComponent[
        DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_video(tag: video): StyledComponent[
        DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
        TextareaProps, 
        Theme
      ] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], TextareaProps, Theme] = js.native
    @JSImport("@storybook/components/dist/form/input/input", "Textarea.withComponent")
    @js.native
    def withComponent_webview(tag: webview): StyledComponent[
        DetailedHTMLProps[WebViewHTMLAttributes[HTMLElement], HTMLElement], 
        TextareaProps, 
        Theme
      ] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookComponents.storybookComponentsStrings.end
    - typingsSlinky.storybookComponents.storybookComponentsStrings.center
    - typingsSlinky.storybookComponents.storybookComponentsStrings.start
  */
  trait Alignments extends StObject
  object Alignments {
    
    @scala.inline
    def center: typingsSlinky.storybookComponents.storybookComponentsStrings.center = "center".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.center]
    
    @scala.inline
    def end: typingsSlinky.storybookComponents.storybookComponentsStrings.end = "end".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.end]
    
    @scala.inline
    def start: typingsSlinky.storybookComponents.storybookComponentsStrings.start = "start".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.start]
  }
  
  /* Inlined std.Omit<react.react.HTMLProps<std.HTMLInputElement>, keyof @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps */
  @js.native
  trait InputProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    var about: js.UndefOr[String] = js.native
    
    var accept: js.UndefOr[String] = js.native
    
    var acceptCharset: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var action: js.UndefOr[String] = js.native
    
    var align: js.UndefOr[Alignments] = js.native
    
    var allowFullScreen: js.UndefOr[Boolean] = js.native
    
    var allowTransparency: js.UndefOr[Boolean] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var async: js.UndefOr[Boolean] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[Boolean | String] = js.native
    
    var cellPadding: js.UndefOr[Double | String] = js.native
    
    var cellSpacing: js.UndefOr[Double | String] = js.native
    
    var challenge: js.UndefOr[String] = js.native
    
    var charSet: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var cite: js.UndefOr[String] = js.native
    
    var classID: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var coords: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var dateTime: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var download: js.UndefOr[js.Any] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var encType: js.UndefOr[String] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var frameBorder: js.UndefOr[Double | String] = js.native
    
    var headers: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var high: js.UndefOr[Double] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var hrefLang: js.UndefOr[String] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var httpEquiv: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyParams: js.UndefOr[String] = js.native
    
    var keyType: js.UndefOr[String] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var low: js.UndefOr[Double] = js.native
    
    var manifest: js.UndefOr[String] = js.native
    
    var marginHeight: js.UndefOr[Double] = js.native
    
    var marginWidth: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var mediaGroup: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLInputElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLInputElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLInputElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLInputElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLInputElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLInputElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLInputElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLInputElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLInputElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var optimum: js.UndefOr[Double] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var playsInline: js.UndefOr[Boolean] = js.native
    
    var poster: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var preload: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[LegacyRef[HTMLInputElement]] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var sandbox: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var scrolling: js.UndefOr[String] = js.native
    
    var seamless: js.UndefOr[Boolean] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var shape: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Sizes] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcDoc: js.UndefOr[String] = js.native
    
    var srcLang: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var useMap: js.UndefOr[String] = js.native
    
    var valid: js.UndefOr[ValidationStates] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var wmode: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  object InputProps {
    
    @scala.inline
    def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLInputElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLInputElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait InputStyleProps extends StObject {
    
    var align: js.UndefOr[Alignments] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Sizes] = js.native
    
    var valid: js.UndefOr[ValidationStates] = js.native
  }
  object InputStyleProps {
    
    @scala.inline
    def apply(): InputStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputStyleProps]
    }
    
    @scala.inline
    implicit class InputStylePropsMutableBuilder[Self <: InputStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  /* Inlined std.Omit<react.react.SelectHTMLAttributes<std.HTMLSelectElement>, keyof @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps> & @storybook/components.@storybook/components/dist/form/input/input.InputStyleProps */
  @js.native
  trait SelectProps extends StObject {
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var align: js.UndefOr[Alignments] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLSelectElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLSelectElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLSelectElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLSelectElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLSelectElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLSelectElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLSelectElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLSelectElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLSelectElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLSelectElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLSelectElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLSelectElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLSelectElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLSelectElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLSelectElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Sizes] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var valid: js.UndefOr[ValidationStates] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object SelectProps {
    
    @scala.inline
    def apply(): SelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps]
    }
    
    @scala.inline
    implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAlign(value: Alignments): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLSelectElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLSelectElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLSelectElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSize(value: Sizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setValid(value: ValidationStates): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookComponents.storybookComponentsStrings.`100Percentsign`
    - typingsSlinky.storybookComponents.storybookComponentsStrings.flex
    - typingsSlinky.storybookComponents.storybookComponentsStrings.auto
  */
  trait Sizes extends StObject
  object Sizes {
    
    @scala.inline
    def `100Percentsign`: typingsSlinky.storybookComponents.storybookComponentsStrings.`100Percentsign` = "100%".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.`100Percentsign`]
    
    @scala.inline
    def auto: typingsSlinky.storybookComponents.storybookComponentsStrings.auto = "auto".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.auto]
    
    @scala.inline
    def flex: typingsSlinky.storybookComponents.storybookComponentsStrings.flex = "flex".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.flex]
  }
  
  type TextareaProps = (typingsSlinky.std.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TextareaAutosizeProps */ _, 
    size | align | valid | height
  ]) with InputStyleProps
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookComponents.storybookComponentsStrings.valid
    - typingsSlinky.storybookComponents.storybookComponentsStrings.error
    - typingsSlinky.storybookComponents.storybookComponentsStrings.warn
  */
  trait ValidationStates extends StObject
  object ValidationStates {
    
    @scala.inline
    def error: typingsSlinky.storybookComponents.storybookComponentsStrings.error = "error".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.error]
    
    @scala.inline
    def valid: typingsSlinky.storybookComponents.storybookComponentsStrings.valid = "valid".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.valid]
    
    @scala.inline
    def warn: typingsSlinky.storybookComponents.storybookComponentsStrings.warn = "warn".asInstanceOf[typingsSlinky.storybookComponents.storybookComponentsStrings.warn]
  }
}
