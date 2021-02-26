package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VersionControlChangeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "VersionControlChangeType")
@js.native
object VersionControlChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VersionControlChangeType with Double] = js.native
  
  @js.native
  sealed trait Add extends VersionControlChangeType
  /* 1 */ val Add: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Add with Double = js.native
  
  @js.native
  sealed trait All extends VersionControlChangeType
  /* 8191 */ val All: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.All with Double = js.native
  
  @js.native
  sealed trait Branch extends VersionControlChangeType
  /* 64 */ val Branch: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Branch with Double = js.native
  
  @js.native
  sealed trait Delete extends VersionControlChangeType
  /* 16 */ val Delete: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Delete with Double = js.native
  
  @js.native
  sealed trait Edit extends VersionControlChangeType
  /* 2 */ val Edit: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Edit with Double = js.native
  
  @js.native
  sealed trait Encoding extends VersionControlChangeType
  /* 4 */ val Encoding: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Encoding with Double = js.native
  
  @js.native
  sealed trait Lock extends VersionControlChangeType
  /* 256 */ val Lock: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Lock with Double = js.native
  
  @js.native
  sealed trait Merge extends VersionControlChangeType
  /* 128 */ val Merge: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Merge with Double = js.native
  
  @js.native
  sealed trait None extends VersionControlChangeType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.None with Double = js.native
  
  @js.native
  sealed trait Property extends VersionControlChangeType
  /* 4096 */ val Property: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Property with Double = js.native
  
  @js.native
  sealed trait Rename extends VersionControlChangeType
  /* 8 */ val Rename: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Rename with Double = js.native
  
  @js.native
  sealed trait Rollback extends VersionControlChangeType
  /* 512 */ val Rollback: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Rollback with Double = js.native
  
  @js.native
  sealed trait SourceRename extends VersionControlChangeType
  /* 1024 */ val SourceRename: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.SourceRename with Double = js.native
  
  @js.native
  sealed trait TargetRename extends VersionControlChangeType
  /* 2048 */ val TargetRename: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.TargetRename with Double = js.native
  
  @js.native
  sealed trait Undelete extends VersionControlChangeType
  /* 32 */ val Undelete: typingsSlinky.vsoNodeApi.gitInterfacesMod.VersionControlChangeType.Undelete with Double = js.native
}
