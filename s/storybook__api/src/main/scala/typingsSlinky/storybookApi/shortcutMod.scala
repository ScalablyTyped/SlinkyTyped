package typingsSlinky.storybookApi

import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.storybookApi.shortcutsMod.Event
import typingsSlinky.storybookApi.shortcutsMod.KeyCollection
import typingsSlinky.storybookApi.storybookApiStrings.Optionkey
import typingsSlinky.storybookApi.storybookApiStrings.Placeofinterestsign
import typingsSlinky.storybookApi.storybookApiStrings.alt
import typingsSlinky.storybookApi.storybookApiStrings.control
import typingsSlinky.storybookApi.storybookApiStrings.ctrl
import typingsSlinky.storybookApi.storybookApiStrings.meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutMod {
  
  @JSImport("@storybook/api/dist/lib/shortcut", "controlOrMetaKey")
  @js.native
  def controlOrMetaKey(): meta | control = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "controlOrMetaSymbol")
  @js.native
  def controlOrMetaSymbol(): Placeofinterestsign | ctrl = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "eventMatchesShortcut")
  @js.native
  def eventMatchesShortcut(e: Event, shortcut: KeyCollection): Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "eventToShortcut")
  @js.native
  def eventToShortcut(e: KeyboardEvent): KeyCollection | Null = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "isMacLike")
  @js.native
  def isMacLike(): Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "isShortcutTaken")
  @js.native
  def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "keyToSymbol")
  @js.native
  def keyToSymbol(key: String): String = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "optionOrAltSymbol")
  @js.native
  def optionOrAltSymbol(): Optionkey | alt = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "shortcutMatchesShortcut")
  @js.native
  def shortcutMatchesShortcut(inputShortcut: KeyCollection, shortcut: KeyCollection): Boolean = js.native
  
  @JSImport("@storybook/api/dist/lib/shortcut", "shortcutToHumanString")
  @js.native
  def shortcutToHumanString(shortcut: KeyCollection): String = js.native
}
