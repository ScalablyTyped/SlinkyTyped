package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.shortcutsMod.Event
import typingsSlinky.storybookApi.shortcutsMod.KeyCollection
import typingsSlinky.storybookApi.storybookApiStrings.Optionkey
import typingsSlinky.storybookApi.storybookApiStrings.Placeofinterestsign
import typingsSlinky.storybookApi.storybookApiStrings.alt
import typingsSlinky.storybookApi.storybookApiStrings.control
import typingsSlinky.storybookApi.storybookApiStrings.ctrl
import typingsSlinky.storybookApi.storybookApiStrings.meta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/lib/shortcut", JSImport.Namespace)
@js.native
object shortcutMod extends js.Object {
  def controlOrMetaKey(): meta | control = js.native
  def controlOrMetaSymbol(): Placeofinterestsign | ctrl = js.native
  def eventMatchesShortcut(e: Event, shortcut: KeyCollection): Boolean = js.native
  def eventToShortcut(e: Event): KeyCollection = js.native
  def isMacLike(): Boolean = js.native
  def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = js.native
  def keyToSymbol(key: String): String = js.native
  def optionOrAltSymbol(): Optionkey | alt = js.native
  def shortcutMatchesShortcut(inputShortcut: KeyCollection, shortcut: KeyCollection): Boolean = js.native
  def shortcutToHumanString(shortcut: KeyCollection): String = js.native
}

