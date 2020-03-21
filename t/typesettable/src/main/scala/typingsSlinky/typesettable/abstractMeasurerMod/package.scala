package typingsSlinky.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractMeasurerMod {
  type IRuler = js.Function1[
    /* text */ java.lang.String, 
    typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
  ]
  type IRulerFactory = js.Function0[typingsSlinky.typesettable.abstractMeasurerMod.IRuler]
}
