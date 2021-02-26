package typingsSlinky.typedGithubApi

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.organizationMod.MyOrganization
import typingsSlinky.typedGithubApi.userMod.Organization
import typingsSlinky.typedGithubApi.userMod.OrganizationSummary
import typingsSlinky.typedGithubApi.userMod.PrivateOrganization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOrganizationMod {
  
  @JSImport("typed-github-api/dist/organization", "MyOrganizationClass")
  @js.native
  class MyOrganizationClass protected ()
    extends OrganizationClass
       with MyOrganization {
    def this(data: PrivateOrganization, options: OptionsOrRef) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typingsSlinky.typedGithubApi.organizationMod.OrganizationSummary because Already inherited
  - typingsSlinky.typedGithubApi.organizationMod.Organization because var conflicts: avatarUri, description, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt, htmlUri, hasOrganizationProjects, hasRepositoryProjects */ @JSImport("typed-github-api/dist/organization", "OrganizationClass")
  @js.native
  class OrganizationClass protected () extends OrganizationSummaryClass {
    def this(data: Organization, options: OptionsOrRef) = this()
    
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typingsSlinky.typedGithubApi.organizationMod.OrganizationSummary because var conflicts: login. Inlined id, avatarUri, description */ @JSImport("typed-github-api/dist/organization", "OrganizationSummaryClass")
  @js.native
  class OrganizationSummaryClass protected () extends OwnerRefClass {
    def this(data: OrganizationSummary, options: OptionsOrRef) = this()
    
    var avatarUri: String = js.native
    
    var description: String = js.native
    
    var id: Double = js.native
  }
}
