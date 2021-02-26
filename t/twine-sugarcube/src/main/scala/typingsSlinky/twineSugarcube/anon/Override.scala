package typingsSlinky.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Override extends StObject {
  
  /**
    * Allows the destination of passage navigation to be overridden. The callback is passed one parameter, the original
    * destination passage title. If its return value is falsy, the override is cancelled and navigation to the original
    * destination continues unperturbed. If its return value is truthy, the override succeeds and that value is used as
    * the new destination of the navigation.
    *
    * @since 2.13.0
    * @example
    * Config.navigation.override = function (destinationPassage) {
    *         // code
    * };
    *
    * @example
    * // Force the player to the "You Died" passage if they let $health get too low.
    * Config.navigation.override = function (dest) {
    *     var sv = State.variables;
    *     // If $health is less-than-or-equal to 0, go to the "You Died" passage instead.
    *     if (sv.health <= 0) {
    *         return "You Died";
    *     }
    * };
    */
  def `override`(passageName: String): js.Any = js.native
}
object Override {
  
  @scala.inline
  def apply(`override`: String => js.Any): Override = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(js.Any.fromFunction1(`override`))
    __obj.asInstanceOf[Override]
  }
  
  @scala.inline
  implicit class OverrideMutableBuilder[Self <: Override] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverride(value: String => js.Any): Self = StObject.set(x, "override", js.Any.fromFunction1(value))
  }
}
