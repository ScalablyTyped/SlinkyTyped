package typingsSlinky.xlsx.xlsxMod

import typingsSlinky.cfb.cfbMod.CFB$Blob
import typingsSlinky.cfb.cfbMod.CFB$Container
import typingsSlinky.cfb.cfbMod.CFB$Entry
import typingsSlinky.cfb.cfbMod.CFB$ParsingOptions
import typingsSlinky.cfb.cfbMod.CFB$Utils
import typingsSlinky.cfb.cfbMod.CFB$WritingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xlsx", "CFB")
@js.native
object CFB extends js.Object {
  val utils: CFB$Utils = js.native
  val version: String = js.native
  def find(cfb: CFB$Container, path: String): CFB$Entry | Null = js.native
  def parse(f: CFB$Blob): CFB$Container = js.native
  def parse(f: CFB$Blob, options: CFB$ParsingOptions): CFB$Container = js.native
  def read(f: String): CFB$Container = js.native
  def read(f: String, options: CFB$ParsingOptions): CFB$Container = js.native
  def read(f: CFB$Blob): CFB$Container = js.native
  def read(f: CFB$Blob, options: CFB$ParsingOptions): CFB$Container = js.native
  def write(cfb: CFB$Container): js.Any = js.native
  def write(cfb: CFB$Container, options: CFB$WritingOptions): js.Any = js.native
  def writeFile(cfb: CFB$Container, filename: String): js.Any = js.native
  def writeFile(cfb: CFB$Container, filename: String, options: CFB$WritingOptions): js.Any = js.native
  @js.native
  object CFB$EntryType extends js.Object {
    /* 3 */ val lockbytes: typingsSlinky.cfb.cfbMod.CFB$EntryType.lockbytes with Double = js.native
    /* 4 */ val property: typingsSlinky.cfb.cfbMod.CFB$EntryType.property with Double = js.native
    /* 5 */ val root: typingsSlinky.cfb.cfbMod.CFB$EntryType.root with Double = js.native
    /* 1 */ val storage: typingsSlinky.cfb.cfbMod.CFB$EntryType.storage with Double = js.native
    /* 2 */ val stream: typingsSlinky.cfb.cfbMod.CFB$EntryType.stream with Double = js.native
    /* 0 */ val unknown: typingsSlinky.cfb.cfbMod.CFB$EntryType.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cfb.cfbMod.CFB$EntryType with Double] = js.native
  }
  
  @js.native
  object CFB$StorageType extends js.Object {
    /* 0 */ val fat: typingsSlinky.cfb.cfbMod.CFB$StorageType.fat with Double = js.native
    /* 1 */ val minifat: typingsSlinky.cfb.cfbMod.CFB$StorageType.minifat with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.cfb.cfbMod.CFB$StorageType with Double] = js.native
  }
  
}

