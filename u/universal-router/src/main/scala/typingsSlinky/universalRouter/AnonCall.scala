package typingsSlinky.universalRouter

import typingsSlinky.pathToRegexp.mod.Key
import typingsSlinky.pathToRegexp.mod.MatchFunction
import typingsSlinky.pathToRegexp.mod.ParseOptions
import typingsSlinky.pathToRegexp.mod.Path
import typingsSlinky.pathToRegexp.mod.PathFunction
import typingsSlinky.pathToRegexp.mod.RegExpOptions
import typingsSlinky.pathToRegexp.mod.Token
import typingsSlinky.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  def apply(path: Path): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def apply(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): js.RegExp = js.native
  def compile[P /* <: js.Object */](path: String): PathFunction[P] = js.native
  def compile[P /* <: js.Object */](path: String, options: ParseOptions with TokensToFunctionOptions): PathFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String): MatchFunction[P] = js.native
  def `match`[P /* <: js.Object */](path: String, options: ParseOptions): MatchFunction[P] = js.native
  def parse(path: String): js.Array[Token] = js.native
  def parse(path: String, options: ParseOptions): js.Array[Token] = js.native
  def regexpToFunction[P /* <: js.Object */](re: js.RegExp, keys: js.Array[Key]): MatchFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def tokensToFunction[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = js.native
  def tokensToRegExp(tokens: js.Array[Token]): js.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key]): js.RegExp = js.native
  def tokensToRegExp(tokens: js.Array[Token], keys: js.Array[Key], options: RegExpOptions): js.RegExp = js.native
}

