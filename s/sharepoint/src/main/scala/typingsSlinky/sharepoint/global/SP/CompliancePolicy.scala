package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompliancePolicy {
  
  @JSGlobal("SP.CompliancePolicy.SPContainerId")
  @js.native
  class SPContainerId ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId
  object SPContainerId {
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.create")
    @js.native
    def create(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, containerId: js.Any): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromList")
    @js.native
    def createFromList(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      list: typingsSlinky.sharepoint.SP.List[_]
    ): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromSite")
    @js.native
    def createFromSite(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, site: typingsSlinky.sharepoint.SP.Site): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPContainerId.createFromWeb")
    @js.native
    def createFromWeb(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPContainerType")
  @js.native
  object SPContainerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType with Double] = js.native
    
    /* 2 */ val list: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.list with Double = js.native
    
    /* 0 */ val site: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.site with Double = js.native
    
    /* 1 */ val web: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.web with Double = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyAssociation")
  @js.native
  class SPPolicyAssociation ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyAssociation
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyBinding")
  @js.native
  class SPPolicyBinding ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyBinding
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyDefinition")
  @js.native
  class SPPolicyDefinition ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyDefinition
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyRule")
  @js.native
  class SPPolicyRule ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyRule
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStore")
  @js.native
  class SPPolicyStore protected ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyStore {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  object SPPolicyStore {
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyAssociation")
    @js.native
    def createPolicyAssociation(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyAssociation = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyBinding")
    @js.native
    def createPolicyBinding(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyBinding = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyDefinition")
    @js.native
    def createPolicyDefinition(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyDefinition = js.native
    
    /* static member */
    @JSGlobal("SP.CompliancePolicy.SPPolicyStore.createPolicyRule")
    @js.native
    def createPolicyRule(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyRule = js.native
  }
  
  @JSGlobal("SP.CompliancePolicy.SPPolicyStoreProxy")
  @js.native
  class SPPolicyStoreProxy protected ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyStoreProxy {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
}
