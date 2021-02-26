package typingsSlinky.typedGithubApi

import typingsSlinky.moment.mod.Moment
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMilestoneMod {
  
  @js.native
  trait Milestone extends StObject {
    
    var closed: js.UndefOr[Moment] = js.native
    
    var closedIssueCount: Double = js.native
    
    var created: Moment = js.native
    
    var creator: UserSummary = js.native
    
    var description: String = js.native
    
    var due: Moment = js.native
    
    var htmlUri: String = js.native
    
    var id: Double = js.native
    
    var number: Double = js.native
    
    var openIssueCount: Double = js.native
    
    var state: open | closed = js.native
    
    var title: String = js.native
    
    var updated: Moment = js.native
  }
  object Milestone {
    
    @scala.inline
    def apply(
      closedIssueCount: Double,
      created: Moment,
      creator: UserSummary,
      description: String,
      due: Moment,
      htmlUri: String,
      id: Double,
      number: Double,
      openIssueCount: Double,
      state: open | closed,
      title: String,
      updated: Moment
    ): Milestone = {
      val __obj = js.Dynamic.literal(closedIssueCount = closedIssueCount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], due = due.asInstanceOf[js.Any], htmlUri = htmlUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], openIssueCount = openIssueCount.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Milestone]
    }
    
    @scala.inline
    implicit class MilestoneMutableBuilder[Self <: Milestone] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosed(value: Moment): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedIssueCount(value: Double): Self = StObject.set(x, "closedIssueCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      @scala.inline
      def setCreated(value: Moment): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreator(value: UserSummary): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDue(value: Moment): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUri(value: String): Self = StObject.set(x, "htmlUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenIssueCount(value: Double): Self = StObject.set(x, "openIssueCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated(value: Moment): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
