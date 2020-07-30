import * as React from "react";
import { List, Datagrid, TextField, EmailField } from 'react-admin';

export const MedList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="name" />
        
        </Datagrid>
    </List>
);