package typingsSlinky.xstyledStyledComponents.mod

import typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsSlinky.styledComponents.styledComponentsMod.AnyStyledComponent
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerAttrs
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerComponent
import typingsSlinky.styledComponents.styledComponentsMod.StyledComponentInnerOtherProps
import typingsSlinky.styledComponents.styledComponentsMod.ThemedStyledFunction
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.a
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.abbr
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.address
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animate
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animateMotion
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animateTransform
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.area
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.article
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.aside
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.audio
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.b
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.base
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.bdi
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.bdo
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.big
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.blockquote
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.body
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.br
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.button
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.canvas
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.caption
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.circle
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.cite
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.clipPath
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.code
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.col
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.colgroup
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.data
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.datalist
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dd
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.defs
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.del
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.desc
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.details
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dfn
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dialog
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.div
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dl
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dt
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ellipse
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.em
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.embed
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feBlend
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feColorMatrix
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feComponentTransfer
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feComposite
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feConvolveMatrix
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDiffuseLighting
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDisplacementMap
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDistantLight
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDropShadow
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFlood
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncA
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncB
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncG
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncR
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feGaussianBlur
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feImage
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMerge
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMergeNode
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMorphology
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feOffset
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.fePointLight
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpecularLighting
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpotLight
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feTile
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feTurbulence
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.fieldset
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.figcaption
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.figure
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.filter
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.footer
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.foreignObject
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.form
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.g
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h1
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h2
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h3
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h4
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h5
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h6
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.head
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.header
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.hgroup
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.hr
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.html
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.i
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.iframe
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.image
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.img
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.input
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ins
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.kbd
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.keygen
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.label
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.legend
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.li
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.line
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.linearGradient
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.link
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.main
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.map
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mark
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.marker
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mask
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.menu
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.menuitem
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.meta
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.metadata
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.meter
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mpath
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.nav
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.noindex
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.noscript
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ol
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.optgroup
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.option
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.output
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.p
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.param
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.path
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.pattern
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.picture
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.polygon
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.polyline
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.pre
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.progress
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.q
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.radialGradient
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rect
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rp
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rt
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ruby
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.s
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.samp
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.script
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.section
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.select
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.slot
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.small
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.source
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.span
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.stop
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.strong
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.style
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.sub
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.summary
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.sup
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.svg
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.switch
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.symbol
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.table
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tbody
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.td
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.template
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.text
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.textPath
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.textarea
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tfoot
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.th
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.thead
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.time
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.title
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tr
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.track
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tspan
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.u
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ul
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.use
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.video
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.view
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.wbr
import typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.webview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Support for xxBoxes, i.e. aBox, articleBox
  * List of dom elements from Styled Components:
  * https://github.com/styled-components/styled-components/blob/master/packages/styled-components/src/utils/domElements.js */
@JSImport("@xstyled/styled-components", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: `object`
  ): ThemedStyledFunction[`object`, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: `var`
  ): ThemedStyledFunction[`var`, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: a
  ): ThemedStyledFunction[a, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: abbr
  ): ThemedStyledFunction[abbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: address
  ): ThemedStyledFunction[address, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: animate
  ): ThemedStyledFunction[animate, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: animateMotion
  ): ThemedStyledFunction[animateMotion, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: animateTransform
  ): ThemedStyledFunction[animateTransform, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: area
  ): ThemedStyledFunction[area, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: article
  ): ThemedStyledFunction[article, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: aside
  ): ThemedStyledFunction[aside, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: audio
  ): ThemedStyledFunction[audio, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: b
  ): ThemedStyledFunction[b, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: base
  ): ThemedStyledFunction[base, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: bdi
  ): ThemedStyledFunction[bdi, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: bdo
  ): ThemedStyledFunction[bdo, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: big
  ): ThemedStyledFunction[big, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: blockquote
  ): ThemedStyledFunction[blockquote, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: body
  ): ThemedStyledFunction[body, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: br
  ): ThemedStyledFunction[br, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: button
  ): ThemedStyledFunction[button, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: canvas
  ): ThemedStyledFunction[canvas, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: caption
  ): ThemedStyledFunction[caption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: circle
  ): ThemedStyledFunction[circle, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: cite
  ): ThemedStyledFunction[cite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: clipPath
  ): ThemedStyledFunction[clipPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: code
  ): ThemedStyledFunction[code, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: col
  ): ThemedStyledFunction[col, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: colgroup
  ): ThemedStyledFunction[colgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: data
  ): ThemedStyledFunction[data, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: datalist
  ): ThemedStyledFunction[datalist, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: dd
  ): ThemedStyledFunction[dd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: defs
  ): ThemedStyledFunction[defs, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: del
  ): ThemedStyledFunction[del, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: desc
  ): ThemedStyledFunction[desc, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: details
  ): ThemedStyledFunction[details, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: dfn
  ): ThemedStyledFunction[dfn, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: dialog
  ): ThemedStyledFunction[dialog, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: div
  ): ThemedStyledFunction[div, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: dl
  ): ThemedStyledFunction[dl, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: dt
  ): ThemedStyledFunction[dt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: ellipse
  ): ThemedStyledFunction[ellipse, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: em
  ): ThemedStyledFunction[em, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: embed
  ): ThemedStyledFunction[embed, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feBlend
  ): ThemedStyledFunction[feBlend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feColorMatrix
  ): ThemedStyledFunction[feColorMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feComponentTransfer
  ): ThemedStyledFunction[feComponentTransfer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feComposite
  ): ThemedStyledFunction[feComposite, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feConvolveMatrix
  ): ThemedStyledFunction[feConvolveMatrix, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feDiffuseLighting
  ): ThemedStyledFunction[feDiffuseLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feDisplacementMap
  ): ThemedStyledFunction[feDisplacementMap, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feDistantLight
  ): ThemedStyledFunction[feDistantLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feDropShadow
  ): ThemedStyledFunction[feDropShadow, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feFlood
  ): ThemedStyledFunction[feFlood, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feFuncA
  ): ThemedStyledFunction[feFuncA, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feFuncB
  ): ThemedStyledFunction[feFuncB, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feFuncG
  ): ThemedStyledFunction[feFuncG, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feFuncR
  ): ThemedStyledFunction[feFuncR, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feGaussianBlur
  ): ThemedStyledFunction[feGaussianBlur, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feImage
  ): ThemedStyledFunction[feImage, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feMerge
  ): ThemedStyledFunction[feMerge, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feMergeNode
  ): ThemedStyledFunction[feMergeNode, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feMorphology
  ): ThemedStyledFunction[feMorphology, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feOffset
  ): ThemedStyledFunction[feOffset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: fePointLight
  ): ThemedStyledFunction[fePointLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feSpecularLighting
  ): ThemedStyledFunction[feSpecularLighting, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feSpotLight
  ): ThemedStyledFunction[feSpotLight, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feTile
  ): ThemedStyledFunction[feTile, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: feTurbulence
  ): ThemedStyledFunction[feTurbulence, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: fieldset
  ): ThemedStyledFunction[fieldset, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: figcaption
  ): ThemedStyledFunction[figcaption, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: figure
  ): ThemedStyledFunction[figure, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: filter
  ): ThemedStyledFunction[filter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: footer
  ): ThemedStyledFunction[footer, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: foreignObject
  ): ThemedStyledFunction[foreignObject, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: form
  ): ThemedStyledFunction[form, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: g
  ): ThemedStyledFunction[g, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h1
  ): ThemedStyledFunction[h1, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h2
  ): ThemedStyledFunction[h2, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h3
  ): ThemedStyledFunction[h3, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h4
  ): ThemedStyledFunction[h4, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h5
  ): ThemedStyledFunction[h5, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: h6
  ): ThemedStyledFunction[h6, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: head
  ): ThemedStyledFunction[head, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: header
  ): ThemedStyledFunction[header, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: hgroup
  ): ThemedStyledFunction[hgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: hr
  ): ThemedStyledFunction[hr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: html
  ): ThemedStyledFunction[html, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: i
  ): ThemedStyledFunction[i, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: iframe
  ): ThemedStyledFunction[iframe, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: image
  ): ThemedStyledFunction[image, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: img
  ): ThemedStyledFunction[img, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: input
  ): ThemedStyledFunction[input, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: ins
  ): ThemedStyledFunction[ins, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: kbd
  ): ThemedStyledFunction[kbd, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: keygen
  ): ThemedStyledFunction[keygen, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: label
  ): ThemedStyledFunction[label, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: legend
  ): ThemedStyledFunction[legend, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: li
  ): ThemedStyledFunction[li, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: line
  ): ThemedStyledFunction[line, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: linearGradient
  ): ThemedStyledFunction[linearGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: link
  ): ThemedStyledFunction[link, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: main
  ): ThemedStyledFunction[main, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: map
  ): ThemedStyledFunction[map, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: mark
  ): ThemedStyledFunction[mark, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: marker
  ): ThemedStyledFunction[marker, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: mask
  ): ThemedStyledFunction[mask, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: menu
  ): ThemedStyledFunction[menu, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: menuitem
  ): ThemedStyledFunction[menuitem, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: meta
  ): ThemedStyledFunction[meta, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: metadata
  ): ThemedStyledFunction[metadata, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: meter
  ): ThemedStyledFunction[meter, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: mpath
  ): ThemedStyledFunction[mpath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: nav
  ): ThemedStyledFunction[nav, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: noindex
  ): ThemedStyledFunction[noindex, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: noscript
  ): ThemedStyledFunction[noscript, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: ol
  ): ThemedStyledFunction[ol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: optgroup
  ): ThemedStyledFunction[optgroup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: option
  ): ThemedStyledFunction[option, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: output
  ): ThemedStyledFunction[output, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: p
  ): ThemedStyledFunction[p, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: param
  ): ThemedStyledFunction[param, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: path
  ): ThemedStyledFunction[path, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: pattern
  ): ThemedStyledFunction[pattern, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: picture
  ): ThemedStyledFunction[picture, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: polygon
  ): ThemedStyledFunction[polygon, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: polyline
  ): ThemedStyledFunction[polyline, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: pre
  ): ThemedStyledFunction[pre, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: progress
  ): ThemedStyledFunction[progress, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: q
  ): ThemedStyledFunction[q, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: radialGradient
  ): ThemedStyledFunction[radialGradient, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: rect
  ): ThemedStyledFunction[rect, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: rp
  ): ThemedStyledFunction[rp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: rt
  ): ThemedStyledFunction[rt, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: ruby
  ): ThemedStyledFunction[ruby, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: s
  ): ThemedStyledFunction[s, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: samp
  ): ThemedStyledFunction[samp, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: script
  ): ThemedStyledFunction[script, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: section
  ): ThemedStyledFunction[section, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: select
  ): ThemedStyledFunction[select, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: slot
  ): ThemedStyledFunction[slot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: small
  ): ThemedStyledFunction[small, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: source
  ): ThemedStyledFunction[source, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: span
  ): ThemedStyledFunction[span, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: stop
  ): ThemedStyledFunction[stop, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: strong
  ): ThemedStyledFunction[strong, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: style
  ): ThemedStyledFunction[style, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: sub
  ): ThemedStyledFunction[sub, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: summary
  ): ThemedStyledFunction[summary, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: sup
  ): ThemedStyledFunction[sup, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: svg
  ): ThemedStyledFunction[svg, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: switch
  ): ThemedStyledFunction[switch, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: symbol
  ): ThemedStyledFunction[symbol, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: table
  ): ThemedStyledFunction[table, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: tbody
  ): ThemedStyledFunction[tbody, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: td
  ): ThemedStyledFunction[td, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: template
  ): ThemedStyledFunction[template, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: text
  ): ThemedStyledFunction[text, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: textPath
  ): ThemedStyledFunction[textPath, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: textarea
  ): ThemedStyledFunction[textarea, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: tfoot
  ): ThemedStyledFunction[tfoot, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: th
  ): ThemedStyledFunction[th, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: thead
  ): ThemedStyledFunction[thead, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: time
  ): ThemedStyledFunction[time, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: title
  ): ThemedStyledFunction[title, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: tr
  ): ThemedStyledFunction[tr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: track
  ): ThemedStyledFunction[track, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: tspan
  ): ThemedStyledFunction[tspan, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: u
  ): ThemedStyledFunction[u, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: ul
  ): ThemedStyledFunction[ul, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: use
  ): ThemedStyledFunction[use, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: video
  ): ThemedStyledFunction[video, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: view
  ): ThemedStyledFunction[view, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: wbr
  ): ThemedStyledFunction[wbr, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply(
    // unfortunately using a conditional type to validate that it can receive a `theme?: Theme`
  // causes tests to fail in TS 3.1
  component: webview
  ): ThemedStyledFunction[webview, AnyIfEmpty[DefaultTheme], js.Object, scala.Nothing] = js.native
  def apply[C /* <: AnyStyledComponent */](component: C): ThemedStyledFunction[
    StyledComponentInnerComponent[C], 
    AnyIfEmpty[DefaultTheme], 
    StyledComponentInnerOtherProps[C], 
    StyledComponentInnerAttrs[C]
  ] = js.native
  
  var a: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.a, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var aBox: ThemedStyledFunction[a, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var abbr: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.abbr, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var abbrBox: ThemedStyledFunction[abbr, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var address: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.address, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var addressBox: ThemedStyledFunction[address, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var animate: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animate, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var animateMotion: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animateMotion, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var animateTransform: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.animateTransform, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var area: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.area, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var areaBox: ThemedStyledFunction[area, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var article: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.article, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var articleBox: ThemedStyledFunction[article, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var aside: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.aside, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var asideBox: ThemedStyledFunction[aside, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var audio: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.audio, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var audioBox: ThemedStyledFunction[audio, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var b: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.b, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var bBox: ThemedStyledFunction[b, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var base: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.base, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var baseBox: ThemedStyledFunction[base, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var bdi: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.bdi, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var bdiBox: ThemedStyledFunction[bdi, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var bdo: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.bdo, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var bdoBox: ThemedStyledFunction[bdo, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var big: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.big, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var bigBox: ThemedStyledFunction[big, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var blockquote: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.blockquote, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var blockquoteBox: ThemedStyledFunction[blockquote, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var body: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.body, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var bodyBox: ThemedStyledFunction[body, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var br: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.br, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var brBox: ThemedStyledFunction[br, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var button: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.button, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var buttonBox: ThemedStyledFunction[button, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var canvas: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.canvas, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var canvasBox: ThemedStyledFunction[canvas, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var caption: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.caption, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var captionBox: ThemedStyledFunction[caption, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var circle: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.circle, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  // SVG
  var circleBox: ThemedStyledFunction[circle, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var cite: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.cite, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var citeBox: ThemedStyledFunction[cite, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var clipPath: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.clipPath, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var clipPathBox: ThemedStyledFunction[clipPath, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var code: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.code, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var codeBox: ThemedStyledFunction[code, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var col: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.col, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var colBox: ThemedStyledFunction[col, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var colgroup: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.colgroup, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var colgroupBox: ThemedStyledFunction[colgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var data: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.data, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var dataBox: ThemedStyledFunction[data, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var datalist: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.datalist, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var datalistBox: ThemedStyledFunction[datalist, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var dd: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dd, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var ddBox: ThemedStyledFunction[dd, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var defs: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.defs, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var defsBox: ThemedStyledFunction[defs, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var del: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.del, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var delBox: ThemedStyledFunction[del, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var desc: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.desc, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var details: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.details, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var detailsBox: ThemedStyledFunction[details, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var dfn: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dfn, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var dfnBox: ThemedStyledFunction[dfn, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var dialog: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dialog, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var dialogBox: ThemedStyledFunction[dialog, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var div: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.div, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var divBox: ThemedStyledFunction[div, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var dl: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dl, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var dlBox: ThemedStyledFunction[dl, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var dt: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.dt, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var dtBox: ThemedStyledFunction[dt, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var ellipse: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ellipse, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var ellipseBox: ThemedStyledFunction[ellipse, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var em: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.em, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var emBox: ThemedStyledFunction[em, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var embed: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.embed, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var embedBox: ThemedStyledFunction[embed, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var feBlend: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feBlend, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feColorMatrix: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feColorMatrix, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feComponentTransfer: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feComponentTransfer, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feComposite: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feComposite, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feConvolveMatrix: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feConvolveMatrix, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feDiffuseLighting: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDiffuseLighting, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feDisplacementMap: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDisplacementMap, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feDistantLight: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDistantLight, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feDropShadow: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feDropShadow, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feFlood: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFlood, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feFuncA: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncA, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feFuncB: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncB, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feFuncG: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncG, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feFuncR: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feFuncR, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feGaussianBlur: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feGaussianBlur, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feImage: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feImage, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feMerge: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMerge, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feMergeNode: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMergeNode, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feMorphology: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feMorphology, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feOffset: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feOffset, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var fePointLight: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.fePointLight, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feSpecularLighting: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpecularLighting, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feSpotLight: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feSpotLight, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feTile: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feTile, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var feTurbulence: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.feTurbulence, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var fieldset: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.fieldset, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var fieldsetBox: ThemedStyledFunction[fieldset, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var figcaption: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.figcaption, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var figcaptionBox: ThemedStyledFunction[figcaption, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var figure: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.figure, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var figureBox: ThemedStyledFunction[figure, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var filter: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.filter, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var footer: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.footer, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var footerBox: ThemedStyledFunction[footer, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var foreignObject: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.foreignObject, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var foreignObjectBox: ThemedStyledFunction[foreignObject, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var form: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.form, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var formBox: ThemedStyledFunction[form, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var g: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.g, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var gBox: ThemedStyledFunction[g, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h1: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h1, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h1Box: ThemedStyledFunction[h1, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h2: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h2, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h2Box: ThemedStyledFunction[h2, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h3: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h3, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h3Box: ThemedStyledFunction[h3, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h4: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h4, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h4Box: ThemedStyledFunction[h4, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h5: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h5, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h5Box: ThemedStyledFunction[h5, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var h6: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.h6, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var h6Box: ThemedStyledFunction[h6, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var head: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.head, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var headBox: ThemedStyledFunction[head, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var header: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.header, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var headerBox: ThemedStyledFunction[header, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var hgroup: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.hgroup, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var hgroupBox: ThemedStyledFunction[hgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var hr: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.hr, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var hrBox: ThemedStyledFunction[hr, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var html: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.html, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var htmlBox: ThemedStyledFunction[html, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var i: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.i, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var iBox: ThemedStyledFunction[i, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var iframe: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.iframe, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var iframeBox: ThemedStyledFunction[iframe, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var image: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.image, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var imageBox: ThemedStyledFunction[image, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var img: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.img, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var imgBox: ThemedStyledFunction[img, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var input: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.input, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var inputBox: ThemedStyledFunction[input, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var ins: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ins, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var insBox: ThemedStyledFunction[ins, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var kbd: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.kbd, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var kbdBox: ThemedStyledFunction[kbd, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var keygen: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.keygen, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var keygenBox: ThemedStyledFunction[keygen, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var label: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.label, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var labelBox: ThemedStyledFunction[label, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var legend: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.legend, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var legendBox: ThemedStyledFunction[legend, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var li: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.li, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var liBox: ThemedStyledFunction[li, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var line: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.line, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var lineBox: ThemedStyledFunction[line, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var linearGradient: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.linearGradient, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var linearGradientBox: ThemedStyledFunction[linearGradient, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var link: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.link, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var linkBox: ThemedStyledFunction[link, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var main: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.main, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var mainBox: ThemedStyledFunction[main, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var map: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.map, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var mapBox: ThemedStyledFunction[map, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var mark: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mark, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var markBox: ThemedStyledFunction[mark, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var marker: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.marker, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var markerBox: ThemedStyledFunction[marker, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var mask: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mask, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var maskBox: ThemedStyledFunction[mask, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var menu: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.menu, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  /* This one breaks, it looks like marquee is not supported in JSX.IntrinsicElements */
  // marqueeBox: ThemedStyledFunction<'marquee', DefaultTheme, BoxProps>
  var menuBox: ThemedStyledFunction[menu, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var menuitem: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.menuitem, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var menuitemBox: ThemedStyledFunction[menuitem, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var meta: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.meta, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var metaBox: ThemedStyledFunction[meta, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var metadata: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.metadata, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var meter: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.meter, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var meterBox: ThemedStyledFunction[meter, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var mpath: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.mpath, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var nav: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.nav, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var navBox: ThemedStyledFunction[nav, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var noindex: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.noindex, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var noscript: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.noscript, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var noscriptBox: ThemedStyledFunction[noscript, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var `object`: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.`object`, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var objectBox: ThemedStyledFunction[`object`, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var ol: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ol, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var olBox: ThemedStyledFunction[ol, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var optgroup: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.optgroup, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var optgroupBox: ThemedStyledFunction[optgroup, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var option: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.option, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var optionBox: ThemedStyledFunction[option, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var output: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.output, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var outputBox: ThemedStyledFunction[output, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var p: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.p, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var pBox: ThemedStyledFunction[p, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var param: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.param, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var paramBox: ThemedStyledFunction[param, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var path: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.path, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var pathBox: ThemedStyledFunction[path, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var pattern: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.pattern, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var patternBox: ThemedStyledFunction[pattern, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var picture: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.picture, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var pictureBox: ThemedStyledFunction[picture, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var polygon: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.polygon, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var polygonBox: ThemedStyledFunction[polygon, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var polyline: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.polyline, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var polylineBox: ThemedStyledFunction[polyline, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var pre: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.pre, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var preBox: ThemedStyledFunction[pre, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var progress: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.progress, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var progressBox: ThemedStyledFunction[progress, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var q: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.q, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var qBox: ThemedStyledFunction[q, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var radialGradient: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.radialGradient, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var radialGradientBox: ThemedStyledFunction[radialGradient, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var rect: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rect, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var rectBox: ThemedStyledFunction[rect, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var rp: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rp, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var rpBox: ThemedStyledFunction[rp, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var rt: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.rt, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var rtBox: ThemedStyledFunction[rt, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var ruby: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ruby, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var rubyBox: ThemedStyledFunction[ruby, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var s: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.s, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var sBox: ThemedStyledFunction[s, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var samp: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.samp, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var sampBox: ThemedStyledFunction[samp, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var script: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.script, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var scriptBox: ThemedStyledFunction[script, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var section: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.section, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var sectionBox: ThemedStyledFunction[section, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var select: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.select, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var selectBox: ThemedStyledFunction[select, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var slot: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.slot, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var small: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.small, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var smallBox: ThemedStyledFunction[small, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var source: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.source, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var sourceBox: ThemedStyledFunction[source, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var span: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.span, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var spanBox: ThemedStyledFunction[span, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var stop: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.stop, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var stopBox: ThemedStyledFunction[stop, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var strong: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.strong, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var strongBox: ThemedStyledFunction[strong, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var style: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.style, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var styleBox: ThemedStyledFunction[style, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var sub: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.sub, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var subBox: ThemedStyledFunction[sub, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var summary: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.summary, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var summaryBox: ThemedStyledFunction[summary, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var sup: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.sup, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var supBox: ThemedStyledFunction[sup, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var svg: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.svg, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var svgBox: ThemedStyledFunction[svg, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var switch: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.switch, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var symbol: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.symbol, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var table: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.table, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var tableBox: ThemedStyledFunction[table, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var tbody: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tbody, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var tbodyBox: ThemedStyledFunction[tbody, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var td: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.td, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var tdBox: ThemedStyledFunction[td, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var template: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.template, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var text: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.text, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var textBox: ThemedStyledFunction[text, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var textPath: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.textPath, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var textarea: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.textarea, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var textareaBox: ThemedStyledFunction[textarea, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var tfoot: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tfoot, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var tfootBox: ThemedStyledFunction[tfoot, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var th: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.th, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var thBox: ThemedStyledFunction[th, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var thead: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.thead, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var theadBox: ThemedStyledFunction[thead, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var time: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.time, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var timeBox: ThemedStyledFunction[time, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var title: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.title, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var titleBox: ThemedStyledFunction[title, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var tr: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tr, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var trBox: ThemedStyledFunction[tr, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var track: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.track, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var trackBox: ThemedStyledFunction[track, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var tspan: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.tspan, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var tspanBox: ThemedStyledFunction[tspan, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var u: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.u, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var uBox: ThemedStyledFunction[u, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var ul: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.ul, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var ulBox: ThemedStyledFunction[ul, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var use: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.use, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var `var`: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.`var`, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var varBox: ThemedStyledFunction[`var`, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var video: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.video, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var videoBox: ThemedStyledFunction[video, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var view: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.view, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var wbr: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.wbr, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
  
  var wbrBox: ThemedStyledFunction[wbr, DefaultTheme, BoxProps, scala.Nothing] = js.native
  
  var webview: ThemedStyledFunction[
    typingsSlinky.xstyledStyledComponents.xstyledStyledComponentsStrings.webview, 
    AnyIfEmpty[DefaultTheme], 
    js.Object, 
    scala.Nothing
  ] = js.native
}
