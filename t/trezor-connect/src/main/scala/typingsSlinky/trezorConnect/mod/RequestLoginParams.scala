package typingsSlinky.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.trezorConnect.anon.CommonParamscallbackLogin
  - typingsSlinky.trezorConnect.mod.LoginChallenge
*/
trait RequestLoginParams extends StObject
object RequestLoginParams {
  
  @scala.inline
  def CommonParamscallbackLogin(callback: () => LoginChallenge): typingsSlinky.trezorConnect.anon.CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    __obj.asInstanceOf[typingsSlinky.trezorConnect.anon.CommonParamscallbackLogin]
  }
  
  @scala.inline
  def LoginChallenge(challengeHidden: String, challengeVisual: String): typingsSlinky.trezorConnect.mod.LoginChallenge = {
    val __obj = js.Dynamic.literal(challengeHidden = challengeHidden.asInstanceOf[js.Any], challengeVisual = challengeVisual.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.trezorConnect.mod.LoginChallenge]
  }
}
