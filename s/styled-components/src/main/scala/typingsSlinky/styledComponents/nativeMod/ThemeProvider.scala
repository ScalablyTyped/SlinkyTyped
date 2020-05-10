package typingsSlinky.styledComponents.nativeMod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.styledComponents.styledComponentsMod.DefaultTheme
import typingsSlinky.styledComponents.styledComponentsMod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components/native", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends Component[
      ThemeProviderProps[
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ], 
      js.Object, 
      js.Any
    ] {
  def this(props: ThemeProviderProps[
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ]) = this()
  def this(
    props: ThemeProviderProps[
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
        typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
      ],
    context: js.Any
  ) = this()
}

@JSImport("styled-components/native", "ThemeProvider")
@js.native
object ThemeProvider
  extends TopLevel[
      ReactComponentClass[
        ThemeProviderProps[
          typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]], 
          typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[typingsSlinky.styledComponents.styledComponentsMod.AnyIfEmpty[DefaultTheme]]
        ]
      ]
    ]

