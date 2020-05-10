package typingsSlinky.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the specific attributes shared by any Credential persisted in user
  * agent’s credential
  * store.
  */
// tslint:disable-next-line no-empty-interface
@JSGlobal("SiteBoundCredential")
@js.native
abstract class SiteBoundCredential () extends Credential {
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  val iconURL: String | Null = js.native
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  val name: String | Null = js.native
}

