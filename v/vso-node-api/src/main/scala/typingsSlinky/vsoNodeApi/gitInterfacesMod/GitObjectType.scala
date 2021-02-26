package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitObjectType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitObjectType")
@js.native
object GitObjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitObjectType with Double] = js.native
  
  @js.native
  sealed trait Bad extends GitObjectType
  /* 0 */ val Bad: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Bad with Double = js.native
  
  @js.native
  sealed trait Blob extends GitObjectType
  /* 3 */ val Blob: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Blob with Double = js.native
  
  @js.native
  sealed trait Commit extends GitObjectType
  /* 1 */ val Commit: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Commit with Double = js.native
  
  @js.native
  sealed trait Ext2 extends GitObjectType
  /* 5 */ val Ext2: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Ext2 with Double = js.native
  
  @js.native
  sealed trait OfsDelta extends GitObjectType
  /* 6 */ val OfsDelta: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.OfsDelta with Double = js.native
  
  @js.native
  sealed trait RefDelta extends GitObjectType
  /* 7 */ val RefDelta: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.RefDelta with Double = js.native
  
  @js.native
  sealed trait Tag extends GitObjectType
  /* 4 */ val Tag: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Tag with Double = js.native
  
  @js.native
  sealed trait Tree extends GitObjectType
  /* 2 */ val Tree: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitObjectType.Tree with Double = js.native
}
