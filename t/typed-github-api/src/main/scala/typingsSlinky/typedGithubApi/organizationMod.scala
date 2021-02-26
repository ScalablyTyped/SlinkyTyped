package typingsSlinky.typedGithubApi

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.anon.Name
import typingsSlinky.typedGithubApi.ownerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMod {
  
  @js.native
  trait MyOrganization extends StObject {
    
    var billingEmail: String = js.native
    
    var collaborators: Double = js.native
    
    var defaultRepositorySettings: String = js.native
    
    var diskUsage: Double = js.native
    
    var membersCanCreateRepositories: Boolean = js.native
    
    var plan: Name = js.native
    
    var privateGists: Double = js.native
    
    var privateReposOwned: Double = js.native
    
    var privateReposTotal: Double = js.native
  }
  object MyOrganization {
    
    @scala.inline
    def apply(
      billingEmail: String,
      collaborators: Double,
      defaultRepositorySettings: String,
      diskUsage: Double,
      membersCanCreateRepositories: Boolean,
      plan: Name,
      privateGists: Double,
      privateReposOwned: Double,
      privateReposTotal: Double
    ): MyOrganization = {
      val __obj = js.Dynamic.literal(billingEmail = billingEmail.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any], defaultRepositorySettings = defaultRepositorySettings.asInstanceOf[js.Any], diskUsage = diskUsage.asInstanceOf[js.Any], membersCanCreateRepositories = membersCanCreateRepositories.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], privateGists = privateGists.asInstanceOf[js.Any], privateReposOwned = privateReposOwned.asInstanceOf[js.Any], privateReposTotal = privateReposTotal.asInstanceOf[js.Any])
      __obj.asInstanceOf[MyOrganization]
    }
    
    @scala.inline
    implicit class MyOrganizationMutableBuilder[Self <: MyOrganization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingEmail(value: String): Self = StObject.set(x, "billingEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollaborators(value: Double): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRepositorySettings(value: String): Self = StObject.set(x, "defaultRepositorySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiskUsage(value: Double): Self = StObject.set(x, "diskUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersCanCreateRepositories(value: Boolean): Self = StObject.set(x, "membersCanCreateRepositories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan(value: Name): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateGists(value: Double): Self = StObject.set(x, "privateGists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateReposOwned(value: Double): Self = StObject.set(x, "privateReposOwned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateReposTotal(value: Double): Self = StObject.set(x, "privateReposTotal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Organization extends OrganizationSummary {
    
    var blog: String = js.native
    
    var company: String = js.native
    
    var createdAt: Moment = js.native
    
    var email: String = js.native
    
    var followers: Double = js.native
    
    var following: Double = js.native
    
    var hasOrganizationProjects: Boolean = js.native
    
    var hasRepositoryProjects: Boolean = js.native
    
    var htmlUri: String = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var publicGists: Double = js.native
    
    var publicRepos: Double = js.native
    
    var updatedAt: Moment = js.native
  }
  
  @js.native
  trait OrganizationSummary extends OwnerRef {
    
    var avatarUri: String = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
  }
}
