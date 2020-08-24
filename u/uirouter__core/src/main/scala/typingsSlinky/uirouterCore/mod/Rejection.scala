package typingsSlinky.uirouterCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Rejection")
@js.native
class Rejection protected ()
  extends typingsSlinky.uirouterCore.transitionMod.Rejection {
  def this(`type`: Double) = this()
  def this(`type`: Double, message: String) = this()
  def this(`type`: Double, message: js.UndefOr[scala.Nothing], detail: js.Any) = this()
  def this(`type`: Double, message: String, detail: js.Any) = this()
}

/* static members */
@JSImport("@uirouter/core", "Rejection")
@js.native
object Rejection extends js.Object {
  /** Returns a Rejection due to aborted transition */
  def aborted(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def aborted(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to aborted transition */
  def errored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def errored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to ignored transition */
  def ignored(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def ignored(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to invalid transition */
  def invalid(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def invalid(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
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
  def normalize(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def normalize(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def normalize(detail: js.Error): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def normalize(detail: typingsSlinky.uirouterCore.rejectFactoryMod.Rejection): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to redirected transition */
  def redirected(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def redirected(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to transition superseded */
  def superseded(): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def superseded(detail: js.UndefOr[scala.Nothing], options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any, options: js.Any): typingsSlinky.uirouterCore.rejectFactoryMod.Rejection = js.native
}

