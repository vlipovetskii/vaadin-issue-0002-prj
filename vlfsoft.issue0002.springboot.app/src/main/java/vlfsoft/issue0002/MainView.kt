package vlfsoft.issue0002

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.button.Button
import com.vaadin.flow.component.formlayout.FormLayout
import com.vaadin.flow.component.grid.GridVariant
import com.vaadin.flow.component.html.Anchor
import com.vaadin.flow.component.icon.Icon
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.Route
import com.vaadin.flow.server.AbstractStreamResource
import com.vaadin.flow.server.InputStreamFactory
import com.vaadin.flow.server.StreamResource
import java.io.ByteArrayInputStream
import java.io.File
import java.io.FileInputStream
import java.io.InputStream

@Suppress("unused")
@Route
class MainView : VerticalLayout() {

    init {

        height = "100vh"

        label("issue0002")

        grid<Pair<String, String>> {

            addThemeVariants(GridVariant.LUMO_COLUMN_BORDERS)

            width = "100%"
            height = "100%"

            addColumn { it.first }
            addColumn { it.second }

            setItems("1" to "111", "2" to "222")

        }

    }

}

// Anchor

