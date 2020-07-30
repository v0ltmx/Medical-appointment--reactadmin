import React from 'react';
import {
  TextInput,
  SimpleForm,
  Create,
  List,
  Datagrid,
  TextField,
} from 'react-admin';


const MedList = props => (
  <List {...props}>
    <Datagrid rowClick="edit">
      <TextField source="id" />
      <TextField source="nome" />
      <TextField source="categoria" />


    </Datagrid>
  </List>
);

const MedCreate = props => (
  <Create title={<span>TADVIDA</span>} {...props}>
    <SimpleForm>
      <TextInput source="Nome medico" />
      <TextInput source="Especialidade" />
    </SimpleForm>
  </Create>
);



export {MedList,MedCreate};