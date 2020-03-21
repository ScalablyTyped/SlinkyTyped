package typingsSlinky.urlRegex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url-regex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Regular expression for matching URLs.
  @example
  ```
  import urlRegex = require('url-regex');
  urlRegex().test('http://github.com foo bar');
  //=> true
  urlRegex().test('www.github.com foo bar');
  //=> true
  urlRegex({exact: true}).test('http://github.com foo bar');
  //=> false
  urlRegex({exact: true}).test('http://github.com');
  //=> true
  urlRegex({strict: false}).test('github.com foo bar');
  //=> true
  urlRegex({exact: true, strict: false}).test('github.com');
  //=> true
  'foo http://github.com bar //google.com'.match(urlRegex());
  //=> ['http://github.com', '//google.com']
  ```
  */
  def apply(): js.RegExp = js.native
  def apply(options: Options): js.RegExp = js.native
}

