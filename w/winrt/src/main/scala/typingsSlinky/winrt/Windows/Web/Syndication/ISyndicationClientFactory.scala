package typingsSlinky.winrt.Windows.Web.Syndication

import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISyndicationClientFactory extends js.Object {
  def createSyndicationClient(serverCredential: PasswordCredential): SyndicationClient = js.native
}

object ISyndicationClientFactory {
  @scala.inline
  def apply(createSyndicationClient: PasswordCredential => SyndicationClient): ISyndicationClientFactory = {
    val __obj = js.Dynamic.literal(createSyndicationClient = js.Any.fromFunction1(createSyndicationClient))
    __obj.asInstanceOf[ISyndicationClientFactory]
  }
  @scala.inline
  implicit class ISyndicationClientFactoryOps[Self <: ISyndicationClientFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateSyndicationClient(value: PasswordCredential => SyndicationClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createSyndicationClient")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

