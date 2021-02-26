package typingsSlinky.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlRecursionType extends StObject
@JSImport("vso-node-api/interfaces/TfvcInterfaces", "VersionControlRecursionType")
@js.native
object VersionControlRecursionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlRecursionType with Double] = js.native
  
  /**
    * Return specified item and all descendants
    */
  @js.native
  sealed trait Full extends VersionControlRecursionType
  /* 120 */ val Full: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType.Full with Double = js.native
  
  /**
    * Only return the specified item.
    */
  @js.native
  sealed trait None extends VersionControlRecursionType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType.None with Double = js.native
  
  /**
    * Return the specified item and its direct children.
    */
  @js.native
  sealed trait OneLevel extends VersionControlRecursionType
  /* 1 */ val OneLevel: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType.OneLevel with Double = js.native
  
  /**
    * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
    */
  @js.native
  sealed trait OneLevelPlusNestedEmptyFolders extends VersionControlRecursionType
  /* 4 */ val OneLevelPlusNestedEmptyFolders: typingsSlinky.vsoNodeApi.tfvcInterfacesMod.VersionControlRecursionType.OneLevelPlusNestedEmptyFolders with Double = js.native
}
