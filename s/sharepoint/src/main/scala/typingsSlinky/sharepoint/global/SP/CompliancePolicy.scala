package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.CompliancePolicy")
@js.native
object CompliancePolicy extends js.Object {
  
  @js.native
  class SPContainerId ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId
  /* static members */
  @js.native
  object SPContainerId extends js.Object {
    
    def create(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, containerId: js.Any): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    def createFromList(
      context: typingsSlinky.sharepoint.SP.ClientRuntimeContext,
      list: typingsSlinky.sharepoint.SP.List[_]
    ): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    def createFromSite(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, site: typingsSlinky.sharepoint.SP.Site): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
    
    def createFromWeb(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web): typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerId = js.native
  }
  
  @js.native
  object SPContainerType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType with Double] = js.native
    
    /* 2 */ val list: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.list with Double = js.native
    
    /* 0 */ val site: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.site with Double = js.native
    
    /* 1 */ val web: typingsSlinky.sharepoint.SP.CompliancePolicy.SPContainerType.web with Double = js.native
  }
  
  @js.native
  class SPPolicyAssociation ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyAssociation
  
  @js.native
  class SPPolicyBinding ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyBinding
  
  @js.native
  class SPPolicyDefinition ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyDefinition
  
  @js.native
  class SPPolicyRule ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyRule
  
  @js.native
  class SPPolicyStore protected ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyStore {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
  /* static members */
  @js.native
  object SPPolicyStore extends js.Object {
    
    def createPolicyAssociation(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyAssociation = js.native
    
    def createPolicyBinding(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyBinding = js.native
    
    def createPolicyDefinition(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyDefinition = js.native
    
    def createPolicyRule(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext): typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyRule = js.native
  }
  
  @js.native
  class SPPolicyStoreProxy protected ()
    extends typingsSlinky.sharepoint.SP.CompliancePolicy.SPPolicyStoreProxy {
    def this(context: typingsSlinky.sharepoint.SP.ClientRuntimeContext, web: typingsSlinky.sharepoint.SP.Web) = this()
  }
}
