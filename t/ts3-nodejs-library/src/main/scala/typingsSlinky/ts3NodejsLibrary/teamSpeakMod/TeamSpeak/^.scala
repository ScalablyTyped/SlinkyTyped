package typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak

import typingsSlinky.std.Partial
import typingsSlinky.ts3NodejsLibrary.anon.PartialConnectionParams
import typingsSlinky.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts3-nodejs-library/lib/TeamSpeak", "TeamSpeak")
@js.native
object ^ extends js.Object {
  
  /**
    * connects via a Promise wrapper
    * @param config config options to connect
    */
  def connect(config: PartialConnectionParams): js.Promise[typingsSlinky.ts3NodejsLibrary.teamSpeakMod.TeamSpeak] = js.native
  
  /**
    * filters an array with given filter
    * @param array the array which should get filtered
    * @param filter filter object
    */
  def filter[T /* <: ResponseEntry */](array: js.Array[T], filter: Partial[T]): js.Array[T] = js.native
  
  /**
    * retrieves the first element of an array
    * @param input the response input
    */
  def singleResponse[T](input: T): T = js.native
  def singleResponse[T](input: js.Array[T]): T = js.native
  
  /**
    * Transforms an Input to an Array
    * @param input input data which should be converted to an array
    */
  def toArray[T](input: T): js.Array[T] = js.native
  def toArray[T](input: js.Array[T]): js.Array[T] = js.native
  
  /**
    * waits a set time of ms
    * @param time time in ms to wait
    */
  def wait(time: Double): js.Promise[_] = js.native
}
