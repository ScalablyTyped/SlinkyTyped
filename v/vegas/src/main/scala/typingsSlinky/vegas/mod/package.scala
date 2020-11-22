package typingsSlinky.vegas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.vegasStrings.center
    - typingsSlinky.vegas.vegasStrings.top
    - typingsSlinky.vegas.vegasStrings.right
    - typingsSlinky.vegas.vegasStrings.bottom
    - typingsSlinky.vegas.vegasStrings.left
    - scala.Double
  */
  type AlignType = typingsSlinky.vegas.mod._AlignType | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.mod.Animation
    - typingsSlinky.vegas.vegasStrings.random
    - js.Array[typingsSlinky.vegas.mod.Animation]
  */
  type AnimationType = typingsSlinky.vegas.mod._AnimationType | js.Array[typingsSlinky.vegas.mod.Animation]
  
  type Duration = typingsSlinky.vegas.vegasStrings.auto | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegas.mod.Transition
    - typingsSlinky.vegas.vegasStrings.random
    - js.Array[typingsSlinky.vegas.mod.Transition]
  */
  type TransitionType = typingsSlinky.vegas.mod._TransitionType | js.Array[typingsSlinky.vegas.mod.Transition]
  
  type VegasEnd = typingsSlinky.vegas.vegasStrings.vegasend
  
  type VegasInitEvent = typingsSlinky.vegas.vegasStrings.vegasinit
  
  type VegasInitHnalder[TElement] = typingsSlinky.jquery.JQuery.TriggeredEvent[
    TElement, 
    js.UndefOr[scala.Nothing], 
    org.scalajs.dom.raw.HTMLElement, 
    org.scalajs.dom.raw.HTMLElement
  ]
  
  type VegasPause = typingsSlinky.vegas.vegasStrings.vegaspause
  
  type VegasPlay = typingsSlinky.vegas.vegasStrings.vegasplay
  
  type VegasWalk = typingsSlinky.vegas.vegasStrings.vegaswalk
}
