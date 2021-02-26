package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionVersionFlags extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionVersionFlags")
@js.native
object ExtensionVersionFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionVersionFlags with Double] = js.native
  
  /**
    * No flags exist for this version.
    */
  @js.native
  sealed trait None extends ExtensionVersionFlags
  /* 0 */ val None: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionVersionFlags.None with Double = js.native
  
  /**
    * The Validated flag for a version means the extension version has passed validation and can be used..
    */
  @js.native
  sealed trait Validated extends ExtensionVersionFlags
  /* 1 */ val Validated: typingsSlinky.vsoNodeApi.galleryInterfacesMod.ExtensionVersionFlags.Validated with Double = js.native
}
