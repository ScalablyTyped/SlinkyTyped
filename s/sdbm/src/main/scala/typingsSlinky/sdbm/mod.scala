package typingsSlinky.sdbm

import typingsSlinky.sdbm.anon.Call
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sdbm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
  	[SDBM](http://www.cse.yorku.ca/~oz/hash.html#sdbm) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import sdbm = require('sdbm');
  	sdbm('🦄🌈');
  	//=> 4053542802
  	```
  	*/
  def apply(string: String): Double = js.native
  
  /**
  	[SDBM](http://www.cse.yorku.ca/~oz/hash.html#sdbm) non-cryptographic hash function.
  	@returns The hash as a positive integer.
  	@example
  	```
  	import sdbm = require('sdbm');
  	sdbm('🦄🌈');
  	//=> 4053542802
  	```
  	*/
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function sdbm(string: string): number;
  // export = sdbm;
  def default(string: String): Double = js.native
  // TODO: remove this in the next major version, refactor the whole definition to:
  // declare function sdbm(string: string): number;
  // export = sdbm;
  @JSName("default")
  var default_Original: Call = js.native
}
