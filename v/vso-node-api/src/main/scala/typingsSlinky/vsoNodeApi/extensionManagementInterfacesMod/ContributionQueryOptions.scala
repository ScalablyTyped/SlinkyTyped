package typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContributionQueryOptions extends StObject
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "ContributionQueryOptions")
@js.native
object ContributionQueryOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContributionQueryOptions with Double] = js.native
  
  /**
    * Some callers may want the entire tree back without constraint evaluation being performed.
    */
  @js.native
  sealed trait IgnoreConstraints extends ContributionQueryOptions
  /* 256 */ val IgnoreConstraints: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IgnoreConstraints with Double = js.native
  
  /**
    * Include the contribution being queried as well as all contributions that target them recursively.
    */
  @js.native
  sealed trait IncludeAll extends ContributionQueryOptions
  /* 112 */ val IncludeAll: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeAll with Double = js.native
  
  /**
    * Include the contributions that directly target the contributions queried.
    */
  @js.native
  sealed trait IncludeChildren extends ContributionQueryOptions
  /* 32 */ val IncludeChildren: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeChildren with Double = js.native
  
  /**
    * Include the direct contributions that have the ids queried.
    */
  @js.native
  sealed trait IncludeSelf extends ContributionQueryOptions
  /* 16 */ val IncludeSelf: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeSelf with Double = js.native
  
  /**
    * Include the contributions from the entire sub-tree targetting the contributions queried.
    */
  @js.native
  sealed trait IncludeSubTree extends ContributionQueryOptions
  /* 96 */ val IncludeSubTree: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.IncludeSubTree with Double = js.native
  
  @js.native
  sealed trait None extends ContributionQueryOptions
  /* 0 */ val None: typingsSlinky.vsoNodeApi.extensionManagementInterfacesMod.ContributionQueryOptions.None with Double = js.native
}
