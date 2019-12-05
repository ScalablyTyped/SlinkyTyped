package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparkpostMod {
  import typingsSlinky.sparkpost.Anon_Results

  type Callback[T] = js.Function2[/* err */ js.Error | SparkPostError | Null, /* res */ Response[T], Unit]
  type Recipient = (RecipientWithAddress | RecipientWithMultichannelAddresses) with BaseRecipient
  type ResultsCallback[T] = Callback[Anon_Results[T]]
  type ResultsPromise[T] = js.Promise[Anon_Results[T]]
}
