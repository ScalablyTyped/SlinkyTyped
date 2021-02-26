package typingsSlinky.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitConflictType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitConflictType")
@js.native
object GitConflictType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitConflictType with Double] = js.native
  
  /**
    * Added on source and target; content differs
    */
  @js.native
  sealed trait AddAdd extends GitConflictType
  /* 1 */ val AddAdd: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.AddAdd with Double = js.native
  
  /**
    * Added on source and rename destination on target
    */
  @js.native
  sealed trait AddRename extends GitConflictType
  /* 2 */ val AddRename: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.AddRename with Double = js.native
  
  /**
    * Deleted on source and edited on target
    */
  @js.native
  sealed trait DeleteEdit extends GitConflictType
  /* 3 */ val DeleteEdit: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.DeleteEdit with Double = js.native
  
  /**
    * Deleted on source and renamed on target
    */
  @js.native
  sealed trait DeleteRename extends GitConflictType
  /* 4 */ val DeleteRename: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.DeleteRename with Double = js.native
  
  /**
    * Children of directory which has DirectoryFile or FileDirectory conflict
    */
  @js.native
  sealed trait DirectoryChild extends GitConflictType
  /* 6 */ val DirectoryChild: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.DirectoryChild with Double = js.native
  
  /**
    * Path is a directory on source and a file on target
    */
  @js.native
  sealed trait DirectoryFile extends GitConflictType
  /* 5 */ val DirectoryFile: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.DirectoryFile with Double = js.native
  
  /**
    * Edited on source and deleted on target
    */
  @js.native
  sealed trait EditDelete extends GitConflictType
  /* 7 */ val EditDelete: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.EditDelete with Double = js.native
  
  /**
    * Edited on source and target; content differs
    */
  @js.native
  sealed trait EditEdit extends GitConflictType
  /* 8 */ val EditEdit: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.EditEdit with Double = js.native
  
  /**
    * Path is a file on source and a directory on target
    */
  @js.native
  sealed trait FileDirectory extends GitConflictType
  /* 9 */ val FileDirectory: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.FileDirectory with Double = js.native
  
  /**
    * No conflict
    */
  @js.native
  sealed trait None extends GitConflictType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.None with Double = js.native
  
  /**
    * Same file renamed on both source and target; destination paths differ
    */
  @js.native
  sealed trait Rename1to2 extends GitConflictType
  /* 10 */ val Rename1to2: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.Rename1to2 with Double = js.native
  
  /**
    * Different files renamed to same destination path on both source and target
    */
  @js.native
  sealed trait Rename2to1 extends GitConflictType
  /* 11 */ val Rename2to1: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.Rename2to1 with Double = js.native
  
  /**
    * Rename destination on source and new file on target
    */
  @js.native
  sealed trait RenameAdd extends GitConflictType
  /* 12 */ val RenameAdd: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.RenameAdd with Double = js.native
  
  /**
    * Renamed on source and deleted on target
    */
  @js.native
  sealed trait RenameDelete extends GitConflictType
  /* 13 */ val RenameDelete: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.RenameDelete with Double = js.native
  
  /**
    * Rename destination on both source and target; content differs
    */
  @js.native
  sealed trait RenameRename extends GitConflictType
  /* 14 */ val RenameRename: typingsSlinky.vsoNodeApi.gitInterfacesMod.GitConflictType.RenameRename with Double = js.native
}
