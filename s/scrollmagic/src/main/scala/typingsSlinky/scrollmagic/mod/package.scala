package typingsSlinky.scrollmagic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ElementOrSelector = org.scalajs.dom.raw.Element | java.lang.String
  type EnterEvent = typingsSlinky.scrollmagic.mod.SceneProgressEvent[typingsSlinky.scrollmagic.scrollmagicStrings.enter]
  type LeaveEvent = typingsSlinky.scrollmagic.mod.SceneProgressEvent[typingsSlinky.scrollmagic.scrollmagicStrings.leave]
  type ProgressEvent = typingsSlinky.scrollmagic.mod.SceneProgressEvent[typingsSlinky.scrollmagic.scrollmagicStrings.progress]
  type RemoveEvent = typingsSlinky.scrollmagic.mod.Event[typingsSlinky.scrollmagic.scrollmagicStrings.remove]
  type ScrollTarget = js.Function2[
    /* newScrollPos */ scala.Double, 
    /* repeated */ js.Any, 
    scala.Unit | scala.Double | typingsSlinky.scrollmagic.mod.ElementOrSelector | js.Object
  ]
  type StartEvent = typingsSlinky.scrollmagic.mod.SceneProgressEvent[typingsSlinky.scrollmagic.scrollmagicStrings.start]
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsSlinky.scrollmagic.scrollmagicStrings.onEnter
    - typingsSlinky.scrollmagic.scrollmagicStrings.onCenter
    - typingsSlinky.scrollmagic.scrollmagicStrings.onLeave
  */
  type TriggerHook = typingsSlinky.scrollmagic.mod._TriggerHook | scala.Double
}
