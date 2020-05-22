package typingsSlinky.vfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encodings supported by the buffer class
  *
  * @remarks
  * This is a copy of the typing from Node, copied to prevent Node globals from being needed.
  * Copied from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/a2bc1d868d81733a8969236655fa600bd3651a7b/types/node/globals.d.ts#L174
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vfile.vfileStrings.ascii
  - typingsSlinky.vfile.vfileStrings.utf8
  - typingsSlinky.vfile.vfileStrings.`utf-8`
  - typingsSlinky.vfile.vfileStrings.utf16le
  - typingsSlinky.vfile.vfileStrings.ucs2
  - typingsSlinky.vfile.vfileStrings.`ucs-2`
  - typingsSlinky.vfile.vfileStrings.base64
  - typingsSlinky.vfile.vfileStrings.latin1
  - typingsSlinky.vfile.vfileStrings.binary
  - typingsSlinky.vfile.vfileStrings.hex
*/
trait BufferEncoding extends js.Object

object BufferEncoding {
  @scala.inline
  def ascii: typingsSlinky.vfile.vfileStrings.ascii = "ascii".asInstanceOf[typingsSlinky.vfile.vfileStrings.ascii]
  @scala.inline
  def base64: typingsSlinky.vfile.vfileStrings.base64 = "base64".asInstanceOf[typingsSlinky.vfile.vfileStrings.base64]
  @scala.inline
  def binary: typingsSlinky.vfile.vfileStrings.binary = "binary".asInstanceOf[typingsSlinky.vfile.vfileStrings.binary]
  @scala.inline
  def hex: typingsSlinky.vfile.vfileStrings.hex = "hex".asInstanceOf[typingsSlinky.vfile.vfileStrings.hex]
  @scala.inline
  def latin1: typingsSlinky.vfile.vfileStrings.latin1 = "latin1".asInstanceOf[typingsSlinky.vfile.vfileStrings.latin1]
  @scala.inline
  def `ucs-2`: typingsSlinky.vfile.vfileStrings.`ucs-2` = "ucs-2".asInstanceOf[typingsSlinky.vfile.vfileStrings.`ucs-2`]
  @scala.inline
  def ucs2: typingsSlinky.vfile.vfileStrings.ucs2 = "ucs2".asInstanceOf[typingsSlinky.vfile.vfileStrings.ucs2]
  @scala.inline
  def `utf-8`: typingsSlinky.vfile.vfileStrings.`utf-8` = "utf-8".asInstanceOf[typingsSlinky.vfile.vfileStrings.`utf-8`]
  @scala.inline
  def utf16le: typingsSlinky.vfile.vfileStrings.utf16le = "utf16le".asInstanceOf[typingsSlinky.vfile.vfileStrings.utf16le]
  @scala.inline
  def utf8: typingsSlinky.vfile.vfileStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.vfile.vfileStrings.utf8]
}

