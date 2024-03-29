package typingsSlinky.wordpressComponents

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressComponents.anon.IsElevated
import typingsSlinky.wordpressComponents.cardMod.Card.Props
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`object`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`var`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.a
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.abbr
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.address
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.animate
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.animateMotion
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.animateTransform
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.area
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.article
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.aside
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.audio
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.b
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.base
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.bdi
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.bdo
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.big
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.blockquote
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.body
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.br
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.button
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.canvas
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.caption
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.circle
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.cite
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.clipPath
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.code
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.col
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.colgroup
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.data
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.datalist
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dd
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.defs
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.del
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.desc
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.details
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dfn
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dialog
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.div
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dl
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.dt
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ellipse
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.em
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.embed
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feBlend
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feColorMatrix
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feComponentTransfer
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feComposite
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feConvolveMatrix
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feDiffuseLighting
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feDisplacementMap
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feDistantLight
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feDropShadow
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feFlood
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feFuncA
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feFuncB
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feFuncG
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feFuncR
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feGaussianBlur
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feImage
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feMerge
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feMergeNode
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feMorphology
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feOffset
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.fePointLight
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feSpecularLighting
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feSpotLight
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feTile
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.feTurbulence
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.fieldset
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.figcaption
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.figure
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.filter
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.footer
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.foreignObject
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.form
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.g
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h1
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h2
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h3
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h4
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h5
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.h6
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.head
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.header
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.hgroup
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.hr
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.html
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.i
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.iframe
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.image
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.img
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.input
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ins
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.kbd
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keygen
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.label
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.legend
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.li
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.line
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.linearGradient
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.link
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.main
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.map
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.mark
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.marker
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.mask
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.menu
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.menuitem
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.meta
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.metadata
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.meter
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.mpath
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.nav
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noindex
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.noscript
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ol
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.optgroup
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.option
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.output
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.p
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.param
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.path
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.pattern
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.picture
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.polygon
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.polyline
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.pre
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.progress
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.q
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.radialGradient
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.rect
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.rp
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.rt
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ruby
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.s
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.samp
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.script
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.section
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.select
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.slot
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.small
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.source
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.span
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.stop
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.strong
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.style
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.sub
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.summary
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.sup
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.svg
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.switch
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.symbol
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.table
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tbody
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.td
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.template
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.text
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.textPath
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.textarea
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tfoot
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.th
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.thead
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.time
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.title
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tr
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.track
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.tspan
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.u
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.ul
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.use
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.video
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.view
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.wbr
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  object default {
    
    // tslint:disable-next-line no-unnecessary-generics
    @JSImport("@wordpress/components/card", JSImport.Default)
    @js.native
    def apply(
      props: Props[
          a | abbr | address | animate | animateMotion | animateTransform | area | article | aside | audio | b | base | bdi | bdo | big | blockquote | body | br | button | canvas | caption | circle | cite | clipPath | code | col | colgroup | data | datalist | dd | defs | del | desc | details | dfn | dialog | div | dl | dt | ellipse | em | embed | feBlend | feColorMatrix | feComponentTransfer | feComposite | feConvolveMatrix | feDiffuseLighting | feDisplacementMap | feDistantLight | feDropShadow | feFlood | feFuncA | feFuncB | feFuncG | feFuncR | feGaussianBlur | feImage | feMerge | feMergeNode | feMorphology | feOffset | fePointLight | feSpecularLighting | feSpotLight | feTile | feTurbulence | fieldset | figcaption | figure | filter | footer | foreignObject | form | g | h1 | h2 | h3 | h4 | h5 | h6 | head | header | hgroup | hr | html | i | iframe | image | img | input | ins | kbd | keygen | label | legend | li | line | linearGradient | link | main | map | mark | marker | mask | menu | menuitem | meta | metadata | meter | mpath | nav | noindex | noscript | `object` | ol | optgroup | option | output | p | param | path | pattern | picture | polygon | polyline | pre | progress | q | radialGradient | rect | rp | rt | ruby | s | samp | script | section | select | slot | small | source | span | stop | strong | style | sub | summary | sup | svg | switch | symbol | table | tbody | td | template | text | textPath | textarea | tfoot | th | thead | time | title | tr | track | tspan | u | ul | use | `var` | video | view | wbr | webview
        ]
    ): ReactElement = js.native
  }
  
  object Card {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.large
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.medium
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.small
      - typingsSlinky.wordpressComponents.wordpressComponentsStrings.extraSmall
    */
    trait CardSize extends StObject
    object CardSize {
      
      @scala.inline
      def extraSmall: typingsSlinky.wordpressComponents.wordpressComponentsStrings.extraSmall = "extraSmall".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.extraSmall]
      
      @scala.inline
      def large: typingsSlinky.wordpressComponents.wordpressComponentsStrings.large = "large".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.large]
      
      @scala.inline
      def medium: typingsSlinky.wordpressComponents.wordpressComponentsStrings.medium = "medium".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.medium]
      
      @scala.inline
      def small: typingsSlinky.wordpressComponents.wordpressComponentsStrings.small = "small".asInstanceOf[typingsSlinky.wordpressComponents.wordpressComponentsStrings.small]
    }
    
    type Props[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] = IsElevated[T] with (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  }
}
