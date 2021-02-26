package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a package. */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
abstract class Package ()
  extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Package
object Package {
  
  @JSGlobal("Windows.ApplicationModel.Package")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the package for the current app. */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Package.current")
  @js.native
  def current: typingsSlinky.winrtUwp.Windows.ApplicationModel.Package = js.native
  @scala.inline
  def current_=(x: typingsSlinky.winrtUwp.Windows.ApplicationModel.Package): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
}
