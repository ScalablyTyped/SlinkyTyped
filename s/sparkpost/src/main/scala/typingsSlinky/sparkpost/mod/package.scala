package typingsSlinky.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[
    /* err */ js.Error | typingsSlinky.sparkpost.mod.SparkPostError | scala.Null, 
    /* res */ typingsSlinky.sparkpost.mod.Response[T], 
    scala.Unit
  ]
  
  type Recipient = (typingsSlinky.sparkpost.mod.RecipientWithAddress | typingsSlinky.sparkpost.mod.RecipientWithMultichannelAddresses) with typingsSlinky.sparkpost.mod.BaseRecipient
  
  type ResultsCallback[T] = typingsSlinky.sparkpost.mod.Callback[typingsSlinky.sparkpost.anon.Results[T]]
  
  type ResultsPromise[T] = js.Promise[typingsSlinky.sparkpost.anon.Results[T]]
}
