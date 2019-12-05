package typingsSlinky.timezonecomplete.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Transition")
@js.native
class Transition protected ()
  extends typingsSlinky.timezonecomplete.distLibTzDashDatabaseMod.Transition {
  /**
    * Constructor
    * @param at
    * @param offset
    * @param letter
    * @throws nothing
    */
  def this(
    /**
    * Transition time in UTC millis
    */
  at: Double,
    /**
    * New offset (type of offset depends on the function)
    */
  offset: typingsSlinky.timezonecomplete.distLibDurationMod.Duration,
    /**
    * New timzone abbreviation letter
    */
  letter: String
  ) = this()
}

