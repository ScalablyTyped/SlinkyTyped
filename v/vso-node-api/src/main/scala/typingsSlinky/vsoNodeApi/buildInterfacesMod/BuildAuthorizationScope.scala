package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildAuthorizationScope extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildAuthorizationScope")
@js.native
object BuildAuthorizationScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildAuthorizationScope with Double] = js.native
  
  /**
    * The identity used should have build service account permissions scoped to the project in which the build definition resides. This is useful for isolation of build jobs to a particular team project to avoid any unintentional escalation of privilege attacks during a build.
    */
  @js.native
  sealed trait Project extends BuildAuthorizationScope
  /* 2 */ val Project: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildAuthorizationScope.Project with Double = js.native
  
  /**
    * The identity used should have build service account permissions scoped to the project collection. This is useful when resources for a single build are spread across multiple projects.
    */
  @js.native
  sealed trait ProjectCollection extends BuildAuthorizationScope
  /* 1 */ val ProjectCollection: typingsSlinky.vsoNodeApi.buildInterfacesMod.BuildAuthorizationScope.ProjectCollection with Double = js.native
}
