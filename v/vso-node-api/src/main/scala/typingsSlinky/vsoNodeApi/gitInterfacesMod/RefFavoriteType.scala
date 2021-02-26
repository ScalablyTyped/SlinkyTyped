package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RefFavoriteType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "RefFavoriteType")
@js.native
object RefFavoriteType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RefFavoriteType with Double] = js.native
  
  @js.native
  sealed trait Folder extends RefFavoriteType
  /* 1 */ val Folder: typingsSlinky.vsoNodeApi.gitInterfacesMod.RefFavoriteType.Folder with Double = js.native
  
  @js.native
  sealed trait Invalid extends RefFavoriteType
  /* 0 */ val Invalid: typingsSlinky.vsoNodeApi.gitInterfacesMod.RefFavoriteType.Invalid with Double = js.native
  
  @js.native
  sealed trait Ref extends RefFavoriteType
  /* 2 */ val Ref: typingsSlinky.vsoNodeApi.gitInterfacesMod.RefFavoriteType.Ref with Double = js.native
}
