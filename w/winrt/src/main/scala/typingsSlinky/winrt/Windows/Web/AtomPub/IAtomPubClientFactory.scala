package typingsSlinky.winrt.Windows.Web.AtomPub

import typingsSlinky.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAtomPubClientFactory extends js.Object {
  def createAtomPubClientWithCredentials(serverCredential: PasswordCredential): AtomPubClient = js.native
}

object IAtomPubClientFactory {
  @scala.inline
  def apply(createAtomPubClientWithCredentials: PasswordCredential => AtomPubClient): IAtomPubClientFactory = {
    val __obj = js.Dynamic.literal(createAtomPubClientWithCredentials = js.Any.fromFunction1(createAtomPubClientWithCredentials))
    __obj.asInstanceOf[IAtomPubClientFactory]
  }
  @scala.inline
  implicit class IAtomPubClientFactoryOps[Self <: IAtomPubClientFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAtomPubClientWithCredentials(value: PasswordCredential => AtomPubClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAtomPubClientWithCredentials")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

