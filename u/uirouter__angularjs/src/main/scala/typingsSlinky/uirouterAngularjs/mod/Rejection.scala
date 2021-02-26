package typingsSlinky.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "Rejection")
@js.native
class Rejection protected ()
  extends typingsSlinky.uirouterCore.mod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: js.UndefOr[scala.Nothing], detail: js.Any) = this()
  def this(`type`: Double, message: String, detail: js.Any) = this()
}
/* static members */
object Rejection {
  
  /** Returns a Rejection due to aborted transition */
  @JSImport("@uirouter/angularjs", "Rejection.aborted")
  @js.native
  def aborted(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.aborted")
  @js.native
  def aborted(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to aborted transition */
  @JSImport("@uirouter/angularjs", "Rejection.errored")
  @js.native
  def errored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.errored")
  @js.native
  def errored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to ignored transition */
  @JSImport("@uirouter/angularjs", "Rejection.ignored")
  @js.native
  def ignored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.ignored")
  @js.native
  def ignored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to invalid transition */
  @JSImport("@uirouter/angularjs", "Rejection.invalid")
  @js.native
  def invalid(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.invalid")
  @js.native
  def invalid(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
  @JSImport("@uirouter/angularjs", "Rejection.isRejectionPromise")
  @js.native
  def isRejectionPromise(obj: js.Any): Boolean = js.native
  
  /**
    * Returns a Rejection
    *
    * Normalizes a value as a Rejection.
    * If the value is already a Rejection, returns it.
    * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
    *
    * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
    */
  @JSImport("@uirouter/angularjs", "Rejection.normalize")
  @js.native
  def normalize(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.normalize")
  @js.native
  def normalize(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.normalize")
  @js.native
  def normalize(detail: js.Error): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.normalize")
  @js.native
  def normalize(detail: typingsSlinky.uirouterCore.rejectFactoryMod.Rejection): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to redirected transition */
  @JSImport("@uirouter/angularjs", "Rejection.redirected")
  @js.native
  def redirected(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.redirected")
  @js.native
  def redirected(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  
  /** Returns a Rejection due to transition superseded */
  @JSImport("@uirouter/angularjs", "Rejection.superseded")
  @js.native
  def superseded(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.superseded")
  @js.native
  def superseded(detail: js.UndefOr[scala.Nothing], options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.superseded")
  @js.native
  def superseded(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  @JSImport("@uirouter/angularjs", "Rejection.superseded")
  @js.native
  def superseded(detail: js.Any, options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
}
