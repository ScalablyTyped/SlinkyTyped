package typingsSlinky.styledComponents.styledComponentsMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import typingsSlinky.styledComponents.AnonAs
import typingsSlinky.styledComponents.styledComponentsStrings.`object`
import typingsSlinky.styledComponents.styledComponentsStrings.`var`
import typingsSlinky.styledComponents.styledComponentsStrings.a
import typingsSlinky.styledComponents.styledComponentsStrings.abbr
import typingsSlinky.styledComponents.styledComponentsStrings.address
import typingsSlinky.styledComponents.styledComponentsStrings.animate
import typingsSlinky.styledComponents.styledComponentsStrings.animateMotion
import typingsSlinky.styledComponents.styledComponentsStrings.animateTransform
import typingsSlinky.styledComponents.styledComponentsStrings.area
import typingsSlinky.styledComponents.styledComponentsStrings.article
import typingsSlinky.styledComponents.styledComponentsStrings.aside
import typingsSlinky.styledComponents.styledComponentsStrings.audio
import typingsSlinky.styledComponents.styledComponentsStrings.b
import typingsSlinky.styledComponents.styledComponentsStrings.base
import typingsSlinky.styledComponents.styledComponentsStrings.bdi
import typingsSlinky.styledComponents.styledComponentsStrings.bdo
import typingsSlinky.styledComponents.styledComponentsStrings.big
import typingsSlinky.styledComponents.styledComponentsStrings.blockquote
import typingsSlinky.styledComponents.styledComponentsStrings.body
import typingsSlinky.styledComponents.styledComponentsStrings.br
import typingsSlinky.styledComponents.styledComponentsStrings.button
import typingsSlinky.styledComponents.styledComponentsStrings.canvas
import typingsSlinky.styledComponents.styledComponentsStrings.caption
import typingsSlinky.styledComponents.styledComponentsStrings.circle
import typingsSlinky.styledComponents.styledComponentsStrings.cite
import typingsSlinky.styledComponents.styledComponentsStrings.clipPath
import typingsSlinky.styledComponents.styledComponentsStrings.code
import typingsSlinky.styledComponents.styledComponentsStrings.col
import typingsSlinky.styledComponents.styledComponentsStrings.colgroup
import typingsSlinky.styledComponents.styledComponentsStrings.data
import typingsSlinky.styledComponents.styledComponentsStrings.datalist
import typingsSlinky.styledComponents.styledComponentsStrings.dd
import typingsSlinky.styledComponents.styledComponentsStrings.defs
import typingsSlinky.styledComponents.styledComponentsStrings.del
import typingsSlinky.styledComponents.styledComponentsStrings.desc
import typingsSlinky.styledComponents.styledComponentsStrings.details
import typingsSlinky.styledComponents.styledComponentsStrings.dfn
import typingsSlinky.styledComponents.styledComponentsStrings.dialog
import typingsSlinky.styledComponents.styledComponentsStrings.div
import typingsSlinky.styledComponents.styledComponentsStrings.dl
import typingsSlinky.styledComponents.styledComponentsStrings.dt
import typingsSlinky.styledComponents.styledComponentsStrings.ellipse
import typingsSlinky.styledComponents.styledComponentsStrings.em
import typingsSlinky.styledComponents.styledComponentsStrings.embed
import typingsSlinky.styledComponents.styledComponentsStrings.feBlend
import typingsSlinky.styledComponents.styledComponentsStrings.feColorMatrix
import typingsSlinky.styledComponents.styledComponentsStrings.feComponentTransfer
import typingsSlinky.styledComponents.styledComponentsStrings.feComposite
import typingsSlinky.styledComponents.styledComponentsStrings.feConvolveMatrix
import typingsSlinky.styledComponents.styledComponentsStrings.feDiffuseLighting
import typingsSlinky.styledComponents.styledComponentsStrings.feDisplacementMap
import typingsSlinky.styledComponents.styledComponentsStrings.feDistantLight
import typingsSlinky.styledComponents.styledComponentsStrings.feDropShadow
import typingsSlinky.styledComponents.styledComponentsStrings.feFlood
import typingsSlinky.styledComponents.styledComponentsStrings.feFuncA
import typingsSlinky.styledComponents.styledComponentsStrings.feFuncB
import typingsSlinky.styledComponents.styledComponentsStrings.feFuncG
import typingsSlinky.styledComponents.styledComponentsStrings.feFuncR
import typingsSlinky.styledComponents.styledComponentsStrings.feGaussianBlur
import typingsSlinky.styledComponents.styledComponentsStrings.feImage
import typingsSlinky.styledComponents.styledComponentsStrings.feMerge
import typingsSlinky.styledComponents.styledComponentsStrings.feMergeNode
import typingsSlinky.styledComponents.styledComponentsStrings.feMorphology
import typingsSlinky.styledComponents.styledComponentsStrings.feOffset
import typingsSlinky.styledComponents.styledComponentsStrings.fePointLight
import typingsSlinky.styledComponents.styledComponentsStrings.feSpecularLighting
import typingsSlinky.styledComponents.styledComponentsStrings.feSpotLight
import typingsSlinky.styledComponents.styledComponentsStrings.feTile
import typingsSlinky.styledComponents.styledComponentsStrings.feTurbulence
import typingsSlinky.styledComponents.styledComponentsStrings.fieldset
import typingsSlinky.styledComponents.styledComponentsStrings.figcaption
import typingsSlinky.styledComponents.styledComponentsStrings.figure
import typingsSlinky.styledComponents.styledComponentsStrings.filter
import typingsSlinky.styledComponents.styledComponentsStrings.footer
import typingsSlinky.styledComponents.styledComponentsStrings.foreignObject
import typingsSlinky.styledComponents.styledComponentsStrings.form
import typingsSlinky.styledComponents.styledComponentsStrings.g
import typingsSlinky.styledComponents.styledComponentsStrings.h1
import typingsSlinky.styledComponents.styledComponentsStrings.h2
import typingsSlinky.styledComponents.styledComponentsStrings.h3
import typingsSlinky.styledComponents.styledComponentsStrings.h4
import typingsSlinky.styledComponents.styledComponentsStrings.h5
import typingsSlinky.styledComponents.styledComponentsStrings.h6
import typingsSlinky.styledComponents.styledComponentsStrings.head
import typingsSlinky.styledComponents.styledComponentsStrings.header
import typingsSlinky.styledComponents.styledComponentsStrings.hgroup
import typingsSlinky.styledComponents.styledComponentsStrings.hr
import typingsSlinky.styledComponents.styledComponentsStrings.html
import typingsSlinky.styledComponents.styledComponentsStrings.i
import typingsSlinky.styledComponents.styledComponentsStrings.iframe
import typingsSlinky.styledComponents.styledComponentsStrings.image
import typingsSlinky.styledComponents.styledComponentsStrings.img
import typingsSlinky.styledComponents.styledComponentsStrings.input
import typingsSlinky.styledComponents.styledComponentsStrings.ins
import typingsSlinky.styledComponents.styledComponentsStrings.kbd
import typingsSlinky.styledComponents.styledComponentsStrings.keygen
import typingsSlinky.styledComponents.styledComponentsStrings.label
import typingsSlinky.styledComponents.styledComponentsStrings.legend
import typingsSlinky.styledComponents.styledComponentsStrings.li
import typingsSlinky.styledComponents.styledComponentsStrings.line
import typingsSlinky.styledComponents.styledComponentsStrings.linearGradient
import typingsSlinky.styledComponents.styledComponentsStrings.link
import typingsSlinky.styledComponents.styledComponentsStrings.main
import typingsSlinky.styledComponents.styledComponentsStrings.map
import typingsSlinky.styledComponents.styledComponentsStrings.mark
import typingsSlinky.styledComponents.styledComponentsStrings.marker
import typingsSlinky.styledComponents.styledComponentsStrings.mask
import typingsSlinky.styledComponents.styledComponentsStrings.menu
import typingsSlinky.styledComponents.styledComponentsStrings.menuitem
import typingsSlinky.styledComponents.styledComponentsStrings.meta
import typingsSlinky.styledComponents.styledComponentsStrings.metadata
import typingsSlinky.styledComponents.styledComponentsStrings.meter
import typingsSlinky.styledComponents.styledComponentsStrings.mpath
import typingsSlinky.styledComponents.styledComponentsStrings.nav
import typingsSlinky.styledComponents.styledComponentsStrings.noindex
import typingsSlinky.styledComponents.styledComponentsStrings.noscript
import typingsSlinky.styledComponents.styledComponentsStrings.ol
import typingsSlinky.styledComponents.styledComponentsStrings.optgroup
import typingsSlinky.styledComponents.styledComponentsStrings.option
import typingsSlinky.styledComponents.styledComponentsStrings.output
import typingsSlinky.styledComponents.styledComponentsStrings.p
import typingsSlinky.styledComponents.styledComponentsStrings.param
import typingsSlinky.styledComponents.styledComponentsStrings.path
import typingsSlinky.styledComponents.styledComponentsStrings.pattern
import typingsSlinky.styledComponents.styledComponentsStrings.picture
import typingsSlinky.styledComponents.styledComponentsStrings.polygon
import typingsSlinky.styledComponents.styledComponentsStrings.polyline
import typingsSlinky.styledComponents.styledComponentsStrings.pre
import typingsSlinky.styledComponents.styledComponentsStrings.progress
import typingsSlinky.styledComponents.styledComponentsStrings.q
import typingsSlinky.styledComponents.styledComponentsStrings.radialGradient
import typingsSlinky.styledComponents.styledComponentsStrings.rect
import typingsSlinky.styledComponents.styledComponentsStrings.rp
import typingsSlinky.styledComponents.styledComponentsStrings.rt
import typingsSlinky.styledComponents.styledComponentsStrings.ruby
import typingsSlinky.styledComponents.styledComponentsStrings.s
import typingsSlinky.styledComponents.styledComponentsStrings.samp
import typingsSlinky.styledComponents.styledComponentsStrings.script
import typingsSlinky.styledComponents.styledComponentsStrings.section
import typingsSlinky.styledComponents.styledComponentsStrings.select
import typingsSlinky.styledComponents.styledComponentsStrings.slot
import typingsSlinky.styledComponents.styledComponentsStrings.small
import typingsSlinky.styledComponents.styledComponentsStrings.source
import typingsSlinky.styledComponents.styledComponentsStrings.span
import typingsSlinky.styledComponents.styledComponentsStrings.stop
import typingsSlinky.styledComponents.styledComponentsStrings.strong
import typingsSlinky.styledComponents.styledComponentsStrings.style
import typingsSlinky.styledComponents.styledComponentsStrings.sub
import typingsSlinky.styledComponents.styledComponentsStrings.summary
import typingsSlinky.styledComponents.styledComponentsStrings.sup
import typingsSlinky.styledComponents.styledComponentsStrings.svg
import typingsSlinky.styledComponents.styledComponentsStrings.switch
import typingsSlinky.styledComponents.styledComponentsStrings.symbol
import typingsSlinky.styledComponents.styledComponentsStrings.table
import typingsSlinky.styledComponents.styledComponentsStrings.tbody
import typingsSlinky.styledComponents.styledComponentsStrings.td
import typingsSlinky.styledComponents.styledComponentsStrings.template
import typingsSlinky.styledComponents.styledComponentsStrings.text
import typingsSlinky.styledComponents.styledComponentsStrings.textPath
import typingsSlinky.styledComponents.styledComponentsStrings.textarea
import typingsSlinky.styledComponents.styledComponentsStrings.tfoot
import typingsSlinky.styledComponents.styledComponentsStrings.th
import typingsSlinky.styledComponents.styledComponentsStrings.thead
import typingsSlinky.styledComponents.styledComponentsStrings.time
import typingsSlinky.styledComponents.styledComponentsStrings.title
import typingsSlinky.styledComponents.styledComponentsStrings.tr
import typingsSlinky.styledComponents.styledComponentsStrings.track
import typingsSlinky.styledComponents.styledComponentsStrings.tspan
import typingsSlinky.styledComponents.styledComponentsStrings.u
import typingsSlinky.styledComponents.styledComponentsStrings.ul
import typingsSlinky.styledComponents.styledComponentsStrings.use
import typingsSlinky.styledComponents.styledComponentsStrings.video
import typingsSlinky.styledComponents.styledComponentsStrings.view
import typingsSlinky.styledComponents.styledComponentsStrings.wbr
import typingsSlinky.styledComponents.styledComponentsStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent styled-components.styled-components.ForwardRefExoticBase<styled-components.styled-components.StyledComponentProps<C, T, O, A>> */
@js.native
trait StyledComponentBase[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, T /* <: js.Object */, O /* <: js.Object */, A /* <: /* keyof any */ String */] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[StyledComponentProps[C, T, O, A]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[StyledComponentProps[C, T, O, A]]] = js.native
  // add our own fake call signature to implement the polymorphic 'as' prop
  // NOTE: TS <3.2 will refuse to infer the generic and this component becomes impossible to use in JSX
  // just the presence of the overload is enough to break JSX
  //
  // TODO (TypeScript 3.2): actually makes the 'as' prop polymorphic
  // (
  //     props: StyledComponentProps<C, T, O, A> & { as?: never }
  //   ): React.ReactElement<StyledComponentProps<C, T, O, A>>
  // <AsC extends keyof JSX.IntrinsicElements | React.ComponentType<any> = C>(
  //   props: StyledComponentPropsWithAs<AsC, T, O, A>
  // ): React.ReactElement<StyledComponentPropsWithAs<AsC, T, O, A>>
  // TODO (TypeScript 3.2): delete this overload
  def apply(props: (StyledComponentProps[C, T, O, A]) with AnonAs): ReactElement = js.native
  def withComponent[WithC /* <: ReactComponentClass[_] */](component: WithC): StyledComponent[WithC, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_WithC_AnyStyledComponent[WithC /* <: AnyStyledComponent */](component: WithC): StyledComponent[
    StyledComponentInnerComponent[WithC], 
    T, 
    O with StyledComponentInnerOtherProps[WithC], 
    A | StyledComponentInnerAttrs[WithC]
  ] = js.native
  @JSName("withComponent")
  def withComponent_a(component: a): StyledComponent[a, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_abbr(component: abbr): StyledComponent[abbr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_address(component: address): StyledComponent[address, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animate(component: animate): StyledComponent[animate, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animateMotion(component: animateMotion): StyledComponent[animateMotion, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_animateTransform(component: animateTransform): StyledComponent[animateTransform, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_area(component: area): StyledComponent[area, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_article(component: article): StyledComponent[article, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_aside(component: aside): StyledComponent[aside, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_audio(component: audio): StyledComponent[audio, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_b(component: b): StyledComponent[b, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_base(component: base): StyledComponent[base, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_bdi(component: bdi): StyledComponent[bdi, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_bdo(component: bdo): StyledComponent[bdo, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_big(component: big): StyledComponent[big, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_blockquote(component: blockquote): StyledComponent[blockquote, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_body(component: body): StyledComponent[body, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_br(component: br): StyledComponent[br, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_button(component: button): StyledComponent[button, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_canvas(component: canvas): StyledComponent[canvas, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_caption(component: caption): StyledComponent[caption, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_circle(component: circle): StyledComponent[circle, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_cite(component: cite): StyledComponent[cite, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_clipPath(component: clipPath): StyledComponent[clipPath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_code(component: code): StyledComponent[code, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_col(component: col): StyledComponent[col, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_colgroup(component: colgroup): StyledComponent[colgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_data(component: data): StyledComponent[data, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_datalist(component: datalist): StyledComponent[datalist, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dd(component: dd): StyledComponent[dd, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_defs(component: defs): StyledComponent[defs, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_del(component: del): StyledComponent[del, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_desc(component: desc): StyledComponent[desc, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_details(component: details): StyledComponent[details, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dfn(component: dfn): StyledComponent[dfn, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dialog(component: dialog): StyledComponent[dialog, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_div(component: div): StyledComponent[div, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dl(component: dl): StyledComponent[dl, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_dt(component: dt): StyledComponent[dt, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ellipse(component: ellipse): StyledComponent[ellipse, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_em(component: em): StyledComponent[em, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_embed(component: embed): StyledComponent[embed, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feBlend(component: feBlend): StyledComponent[feBlend, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feColorMatrix(component: feColorMatrix): StyledComponent[feColorMatrix, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feComponentTransfer(component: feComponentTransfer): StyledComponent[feComponentTransfer, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feComposite(component: feComposite): StyledComponent[feComposite, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feConvolveMatrix(component: feConvolveMatrix): StyledComponent[feConvolveMatrix, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDiffuseLighting(component: feDiffuseLighting): StyledComponent[feDiffuseLighting, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDisplacementMap(component: feDisplacementMap): StyledComponent[feDisplacementMap, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDistantLight(component: feDistantLight): StyledComponent[feDistantLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feDropShadow(component: feDropShadow): StyledComponent[feDropShadow, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFlood(component: feFlood): StyledComponent[feFlood, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncA(component: feFuncA): StyledComponent[feFuncA, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncB(component: feFuncB): StyledComponent[feFuncB, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncG(component: feFuncG): StyledComponent[feFuncG, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feFuncR(component: feFuncR): StyledComponent[feFuncR, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feGaussianBlur(component: feGaussianBlur): StyledComponent[feGaussianBlur, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feImage(component: feImage): StyledComponent[feImage, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMerge(component: feMerge): StyledComponent[feMerge, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMergeNode(component: feMergeNode): StyledComponent[feMergeNode, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feMorphology(component: feMorphology): StyledComponent[feMorphology, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feOffset(component: feOffset): StyledComponent[feOffset, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_fePointLight(component: fePointLight): StyledComponent[fePointLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feSpecularLighting(component: feSpecularLighting): StyledComponent[feSpecularLighting, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feSpotLight(component: feSpotLight): StyledComponent[feSpotLight, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feTile(component: feTile): StyledComponent[feTile, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_feTurbulence(component: feTurbulence): StyledComponent[feTurbulence, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_fieldset(component: fieldset): StyledComponent[fieldset, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_figcaption(component: figcaption): StyledComponent[figcaption, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_figure(component: figure): StyledComponent[figure, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_filter(component: filter): StyledComponent[filter, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_footer(component: footer): StyledComponent[footer, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_foreignObject(component: foreignObject): StyledComponent[foreignObject, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_form(component: form): StyledComponent[form, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_g(component: g): StyledComponent[g, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h1(component: h1): StyledComponent[h1, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h2(component: h2): StyledComponent[h2, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h3(component: h3): StyledComponent[h3, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h4(component: h4): StyledComponent[h4, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h5(component: h5): StyledComponent[h5, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_h6(component: h6): StyledComponent[h6, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_head(component: head): StyledComponent[head, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_header(component: header): StyledComponent[header, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_hgroup(component: hgroup): StyledComponent[hgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_hr(component: hr): StyledComponent[hr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_html(component: html): StyledComponent[html, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_i(component: i): StyledComponent[i, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_iframe(component: iframe): StyledComponent[iframe, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_image(component: image): StyledComponent[image, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_img(component: img): StyledComponent[img, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_input(component: input): StyledComponent[input, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ins(component: ins): StyledComponent[ins, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_kbd(component: kbd): StyledComponent[kbd, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_keygen(component: keygen): StyledComponent[keygen, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_label(component: label): StyledComponent[label, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_legend(component: legend): StyledComponent[legend, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_li(component: li): StyledComponent[li, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_line(component: line): StyledComponent[line, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_linearGradient(component: linearGradient): StyledComponent[linearGradient, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_link(component: link): StyledComponent[link, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_main(component: main): StyledComponent[main, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_map(component: map): StyledComponent[map, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mark(component: mark): StyledComponent[mark, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_marker(component: marker): StyledComponent[marker, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mask(component: mask): StyledComponent[mask, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_menu(component: menu): StyledComponent[menu, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_menuitem(component: menuitem): StyledComponent[menuitem, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_meta(component: meta): StyledComponent[meta, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_metadata(component: metadata): StyledComponent[metadata, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_meter(component: meter): StyledComponent[meter, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_mpath(component: mpath): StyledComponent[mpath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_nav(component: nav): StyledComponent[nav, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_noindex(component: noindex): StyledComponent[noindex, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_noscript(component: noscript): StyledComponent[noscript, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_object(component: `object`): StyledComponent[`object`, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ol(component: ol): StyledComponent[ol, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_optgroup(component: optgroup): StyledComponent[optgroup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_option(component: option): StyledComponent[option, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_output(component: output): StyledComponent[output, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_p(component: p): StyledComponent[p, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_param(component: param): StyledComponent[param, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_path(component: path): StyledComponent[path, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_pattern(component: pattern): StyledComponent[pattern, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_picture(component: picture): StyledComponent[picture, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_polygon(component: polygon): StyledComponent[polygon, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_polyline(component: polyline): StyledComponent[polyline, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_pre(component: pre): StyledComponent[pre, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_progress(component: progress): StyledComponent[progress, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_q(component: q): StyledComponent[q, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_radialGradient(component: radialGradient): StyledComponent[radialGradient, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rect(component: rect): StyledComponent[rect, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rp(component: rp): StyledComponent[rp, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_rt(component: rt): StyledComponent[rt, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ruby(component: ruby): StyledComponent[ruby, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_s(component: s): StyledComponent[s, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_samp(component: samp): StyledComponent[samp, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_script(component: script): StyledComponent[script, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_section(component: section): StyledComponent[section, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_select(component: select): StyledComponent[select, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_slot(component: slot): StyledComponent[slot, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_small(component: small): StyledComponent[small, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_source(component: source): StyledComponent[source, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_span(component: span): StyledComponent[span, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_stop(component: stop): StyledComponent[stop, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_strong(component: strong): StyledComponent[strong, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_style(component: style): StyledComponent[style, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_sub(component: sub): StyledComponent[sub, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_summary(component: summary): StyledComponent[summary, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_sup(component: sup): StyledComponent[sup, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_svg(component: svg): StyledComponent[svg, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_switch(component: switch): StyledComponent[switch, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_symbol(component: symbol): StyledComponent[symbol, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_table(component: table): StyledComponent[table, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tbody(component: tbody): StyledComponent[tbody, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_td(component: td): StyledComponent[td, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_template(component: template): StyledComponent[template, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_text(component: text): StyledComponent[text, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_textPath(component: textPath): StyledComponent[textPath, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_textarea(component: textarea): StyledComponent[textarea, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tfoot(component: tfoot): StyledComponent[tfoot, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_th(component: th): StyledComponent[th, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_thead(component: thead): StyledComponent[thead, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_time(component: time): StyledComponent[time, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_title(component: title): StyledComponent[title, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tr(component: tr): StyledComponent[tr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_track(component: track): StyledComponent[track, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_tspan(component: tspan): StyledComponent[tspan, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_u(component: u): StyledComponent[u, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_ul(component: ul): StyledComponent[ul, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_use(component: use): StyledComponent[use, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_var(component: `var`): StyledComponent[`var`, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_video(component: video): StyledComponent[video, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_view(component: view): StyledComponent[view, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_wbr(component: wbr): StyledComponent[wbr, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_webview(component: webview): StyledComponent[webview, T, O, A] = js.native
}

